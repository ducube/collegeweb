# collegeweb
### 项目描述： 一款类似于慕课的在线学习网站，分为前台网站系统和后台管理系统，B2C模式。前台用户系统包括:首页、课程、名师、问答、文章。  后台管理系统包括:讲师管理、课程分类管理、课程管理、统计分析、Banner管理、订单管理、权限管理等功能。

技术栈后端：SpringBoot+SpringCloud+MyBatis-Plus+HttpClient +MySQL+Maven+EasyExcel+Nginx ；前端：Node.js+vue.js+element-ui+NUXT+ECharts 。

其他涉及到的中间件包括 Redis、阿里云OSS、阿里云视频点播。

业务中使用了ECharts做图表展示，使用EasyExcel完成分类批量添加、注册分布式单点登录使用了JWT 

项目前后端分离开发: 后端采用SpringCloud微服务架构，持久层用的是MyBatis-Plus，微服务分库设计，使用Swagger生成接口文档，接入了阿里云视频点播、阿里云OSS。
