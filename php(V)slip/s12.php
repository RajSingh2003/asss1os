<?php
$sname=$_POST['sname'];
$cname=$_POST['cname'];
$messag=$_POST['message'];

function fun($sname="",$cname="",$messag="")
{
if(empty($sname) && empty($cname) && empty($messag))
{
    echo "HELLOW!!";
}
else if(empty($sname))
{
    echo "hellow from $cname";
}
else if(empty($cname))
{
    echo "hellow  $sname";
}
else
{
    echo "$messag $sname from $cname";
}
}

fun($sname,$cname,$messag);


?>