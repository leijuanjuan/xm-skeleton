Xm Skeleton
===================================
这是一个Spring Cloud的基础项目



目录结构
--------

```
admin-server-template                   管理后台模板，用vue.js搭建
admin-server                            管理后台服务
api-server                              接口服务
common-lib                              公共资源
config-server                           配置服务，采用git仓库方式
eureka-server                           微服务注册发现中心
generator                               基于Mybatis-plus的生成工具
user-server                             用户服务，提供用户注册，授权等服务
zuul-server                             网关服务，在此服务做了全局token校验
```

运行
--------
1,先导入根目录下的数据库

2, 依次启动，eureka, config等服务


功能
-------

1. 完整的后台管理系统，后端模板采用vue.js开发, 权限可以控制到按钮
2. 用户注册，登录，token存储redis
3. 网关全局token过滤校验
4. 微服务间调用，可设置在feign的头部带上当前请求头的参数，目前带上了token，可以在微服务调用时传递用户令牌
5. 代码自动生成，可自己指定生成模块，基于Mybatis-Plus实现

    ...

开发注意
---------
开发后台模板，请先安装nodeJs到你的系统，然后进入admin-server-template目录中依次执行
```
$ npm install
$ npn run dev
```
如果开发完成了，请执行以下命令, 然后把dist目录里生成的资源文件拷贝到，admin-server的resources的static目录下。
```
$ npm run build
```
