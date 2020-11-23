
var aedarray=[
    {id:1,address:'京港地铁4号线西红门站',place:'下行站台中控室通道旁边',x:116.335169,y:39.795445},
    {id:2,address:'京港地铁4号线北京南站',place:'站台求助电话3旁',x:116.385629,y:39.871108},
    {id:3,address:'京港地铁4号线西单站',place:'站台监察厅旁',x:116.383203,y:39.913374},
    {id:4,address:'京港地铁4号线角门西站',place:'监察厅后面柱子',x:116.37766,y:39.851944},
    {id:5,address:'京港地铁4号线新宫站',place:'上行站台监察厅西侧旁',x:116.369998,y:39.851526}
];
for(var i=0;i<aedarray.length;i++)
{
    addAED(aedarray[i].id,aedarray[i].address,aedarray[i].place,aedarray[i].x,aedarray[i].y);
}