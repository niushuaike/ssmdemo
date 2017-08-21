# ssmdemo
此为一个ssm整合的基本框架

spring springMVC mybatis

1、数据库 MySQL
2、日志 log4j
3、单元测试 junit
4、jstl标准标签库


整合步骤：
1、加载spring容器
    在resource目录中创建applicationContext.xml配置文件
    web.xml中配置ContextLoaderListener监听器

2、spring管理数据源

3、spring整合mybatis
    3.1 注入sqlSessionFactory(事先创建好mybatis配置文件： mybatis-config.xml)
    3.2 自动扫描mapper.xml文件
    3.3 spring管理mybatis的事务
    3.4 配置log4j.properties(不是必须的)

4、springmvc配置
    4.1 配置前端控制器 web.xml中配置dispatchServlet
    4.2 配置适配器、映射器支持注解
    4.3 自动扫描controller(自动扫描组件)
    4.4 配置视图解析器 InternalResourceViewResolver
