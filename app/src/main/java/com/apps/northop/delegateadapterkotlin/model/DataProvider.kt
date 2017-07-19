package com.apps.northop.delegateadapterkotlin.model

import com.apps.northop.delegateadapterkotlin.adapters.common.ViewType
import java.util.ArrayList

/**
 * Created by idan on 14/07/2017.
 * class to provide data
 */

class DataProvider {

  fun getBikes(): ArrayList<ViewType> {
    return arrayListOf(
        Header("BIG BIKES"),
        BigBike("Bike Big 1", "https://www.bigbikerentalbangkok.com/timthumb.php?src=https://www.bigbikerentalbangkok.com/wp-content/uploads/2015/05/Kawasaki-Z800-Big-Bike-Rental-Bangkok.png&w=340&h=227&zc=1"),
        BigBike("Bike Big 2", "http://14255-presscdn-0-60.pagely.netdna-cdn.com/wp-content/uploads/2016/02/big-bike20160209.jpg"),
        BigBike("Bike Big 3", "http://www.hondabigbike.com/ctrl/web/FileStorage/RenderImage.ashx?guid=e293bc787d4d4b579234c483fb94a14d"),
        Header("SMALL BIKES"),
        SmallBike("Bike Small 1", "https://cdn.gearpatrol.com/wp-content/uploads/2016/05/honda-grom-geare-patrol-650.jpg"),
        SmallBike("Bike Small 2", "http://3.bp.blogspot.com/-wbth3kvWmI4/VbqLT97qYGI/AAAAAAAAAN0/5xGYMYFzW-s/s1600/new-vespa-s-bike-scotter-specs-price-image-white.jpg")
    )
  }
}
