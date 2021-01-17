spring-01-ioc1：IOC本质
    控制反转IOC(Inversion of Control),是一种设计思想
    控制反转是一种通过描述（xml或注解）并通过第三方去生产或获取特定对象的方式
    在Spring中实现控制反转的是IOC容器，其实现方法是依赖注入(Dependency Injection,DI)
    
spring-02-ioc2:IOC
    交给Spring来Service对象

spring-03-ioc2:bean初始化
    在配置被加载的时候吗，bean就被创建好了

spring-04-di:
    bean的几种类型的注入和别名

spring-05-cp:
    p标签和c标签

spring-06-beanscope:
    bean的6种作用域：1.singleton：单例 每次get都是同一个
                    2.prototype：多例 每次get都创建一个新的实例
                    3.request：request作用域将bean的使用范围限定在一个http请求中，对于每一个请求，都会单独创建一个bean
                    4.session：session作用域将bean的使用范围一次在一次http会话中，对于每一个会话，Spring容器都会创建一个单独的bean，若session被销毁，则bean也随之销毁
                    5.application： 在Servlet程序中，有一个全局的ServletContext对象，这个对象被整个web应用所共享，
                                    我们可以通过setAttribute方法向其中添加全局共享的数据。而Spring中，application作用域就是这么实现的，
                                    作用域为application的bean，将会被作为ServletContext的属性，存储在其中，然后可以被全局访问，
                                    而且一个ServletContext只会存储这个bean的一个实例对象。ServletContext被销毁，这个bean自然也跟着被销毁。
                                    这好像有点类似于singleton这个作用域，确实非常类似，但是也有一些区别。
                                    单例bean是一个Spring只会创建一个，而这里的却是每个ServletContext包含一个，不论有多少Spring容器，
                                    bean的数量只取决于ServletContext，而且单例bean只能通过容器去获取，是隐式的，而这种作用域的bean却是公开的，
                                    存储在ServletContext中，可直接通过ServletContext获取。
                    5.websocket

spring-07-autowired1:
    bean的自动装配的两种方式：
        1.ByName:需要保证bean的唯一，并且这个bean需要和自动注入的属性set方法值一致
        2.ByType:需要保证bean的class唯一，并且这个bean需要和自动注入的属性的类型一致

spring-08-autowired2:
    使用注解实现自动装配：@Resource和@Autowired
    区别：
    @Autowired是Spring提供的注解，是通过byType的方法注入的,如果byType不唯一可通过@Qualifier指定
    @Resource是java提供的注解，默认通过byName，找不到则通过ByType

spring-10-proxy1：
    静态代理模式

spring-11-proxy12：
    动态代理模式
    使用Proxy代理类和InvocationHandel类
    动态代理模式好处：1.可使真实角色操作更加纯粹，不用关注一些公共的业务
                    2.公共也就交给代理角色，实现业务分工
                    3.公共业务发生拓展的时候，方便集中管理
                    4.一个动态代理类代理的是一个接口，一般对应的一类业务

spring-12-aop1：
    定义切面和后置通知