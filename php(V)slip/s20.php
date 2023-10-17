<html>
<body>
     <table border=1 cellspacing="0">
        <tr>
            <th>item code</th>
            <th>item name</th>
            <th>unit sold</th>
            <th>rate</th>
            <th>Total</th>

            <?php
                 $lines=file("item.dat");

                 foreach($lines as $line)
                 {
                    $det=explode(",",$line);

                    $icode=trim($det[0]);
                    $iname=trim($det[1]);
                    $usold=trim($det[2]);
                    $rate=trim($det[3]);

                    $total=$usold*$rate;

                    echo "<tr>";
                        echo "<td>$icode</td>";
                        echo "<td>$iname</td>";
                        echo "<td>$usold</td>";
                        echo "<td>$rate</td>";
                        echo "<td>$total</td>";
                    echo "</tr>";
                 }
            ?>
 
       </tr>


     </table>

<body>   
</html>