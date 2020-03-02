# Spring 


```
# 本地服务
hugo server -s HuGo/

# 生成静态站点
hugo -s HuGo/

ln -s ~/IdeaProjects/github/hello-world-example/Spring/docs Spring

while true; do 
  sleep 5; 
  docker exec -it hugo bash -c "cd /hello-world-example/Spring;hugo -s HuGo/";
done

```

- https://github.com/alex-shpak/hugo-book
