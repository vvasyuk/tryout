//package rest
//
//import org.junit.{After, Before, Test}
//import scalaj.http.{Http, HttpOptions, HttpResponse}
//
//
//
//class ApiMockedTest {
//    @Before
//    def setUp(){
//      Api.initRoutes(RemoteService)
//    }
//
//    @After
//    def tearDown()  {
//      //stop();
//    }
//
//    @Test
//    def testGet(){
//      val response: HttpResponse[String] = Http("http://localhost:4567/22").option(HttpOptions.connTimeout(10000)).option(HttpOptions.readTimeout(50000)).asString
//      assert("23".equals(response.body))
//    }
//}