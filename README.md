# University Event Management System

*This is a API project for insert, read, update, and delete Students and Events using H2 Database and CrudRepository.

## Framwork
* Spring Boot

## Languages
* Java

## Model

### Student Properties
* @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer studentId;
* @Pattern(regexp = "^[A-Z][a-z]*$")
  private String firstName;
* private String lastName;
* @Min(value = 18)
* @Max(value = 25)
 private Integer age;
* @Enumerated(value = EnumType.STRING)
  private Departments department;
 
 ### Event Properties
 
 * @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer eventId;
* private String eventName;
* private String locationOfEvent;
* @Pattern(regexp = "[0-9]{4}-[0-9]{2}-[0-9]{2}")
private String date;
* @Pattern(regexp = "[0-9]{2}:[0-9]{2}")
  private String startTime;
* @Pattern(regexp = "[0-9]{2}:[0-9]{2}")
  private String endTime;
  
  ### Department Enum
  
  * public enum Departments {
  ME,
  ECE,
  CIVIL,
  CSE
}

## DataFlow

### End Points / Controllers

#### Student
* @PostMapping(value = "/")
* @PutMapping(value = "/department/{department}/id/{id}")
* @DeleteMapping(value = "/id/{id}")
* @GetMapping(value = "/")
* @GetMapping(value = "/id/{id}")

#### Event
* @PostMapping(value = "/")
* @PutMapping(value = "/")
* @DeleteMapping(value = "/id/{id}")
* @GetMapping(value = "/date/{date}")

## Services

### Student
* public String addStudentToDb(Student student)
* @Transactional
  public String updateDepartmentById(Departments department, Integer id)
* public String deleteStudentById(Integer id)
* public List<Student> getAllStudents()
* public Student getStudentById(Integer id)

## Event
* public String addEventToDb(Event event)
* public String updateEvent(Event event)
* public String deleteEventById(Integer id)
* public List<Event> getAllEventsByDate(String date)

## Repository

### Student
*@Repository
  public interface IStudentRepository extends CrudRepository<Student, Integer> {

  @Modifying
  @Query(value = "update students set department = :department where student_id = :id", nativeQuery = true)
  public void updateDepartmentById(String department, Integer id);
}

### Event

* @Repository
  public interface IEventRepository extends CrudRepository<Event, Integer> {
  public List<Event> findByDate(String date);
}

## Database

* In this project for datasource I have used H2 Database's in memory type with SpringDataJPA.

## Datastructure

* List<>/Inumrable<>

## Summary

* This API is a Spring Boot project that is about managing Events. We can create, read, update, and delete Students
and Event. In this project request is sent from the client on HTTP in JSON format or from path variable with server
side validations and stored in object then response is sent back from the server by JSON format to the client.

