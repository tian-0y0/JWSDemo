> 判断表格每一行是否有子分支  

"childNodeType":"?"  
branch 表示有分支  
leaf 表示无分支

> 数据填充位置  

“childData”: [
    ……
]

> 下拉列表显示

分为两种：  
 ```
 默认显示为‘是’ ==> "<select name='' id=''><option value='1' selected>是</option><option value='0'>否</option></select>"

默认显示为‘否’ ==> "<select name='' id=''><option value='1'>是</option><option value='0' selected>否</option></select>"
```  
默认显示是根据selected位置而定的，提交数据应该是根据name值，所以这里的name值也应该从后台获取数据。  

提交方法我准备写在
```
$('select').change(function() {
  console.log("select发生改变提交修改")
})
```