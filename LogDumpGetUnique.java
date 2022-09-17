/* Kotling Code to log unique items from given String and remove Duplicate  */

fun LogDumpGetUnique(): String {

  var log_dump : String = "name=John Trust, username=john3, email=john3@gmail.com, id=434453; name=Hannah Smith, username=hsmith, email=hsm@test.com, id=23312; name=Hannah Smith, username=hsmith, id=3223423, email=hsm@test.com; name=Robert M, username=rm44, id=222342, email=rm@me.com; name=Robert M, username=rm4411, id=5535, email=rm@me.com; name=Susan Vee, username=sv55, id=443432, email=susanv123@me.com; name=Robert Nick, username=rnick33, id=23432, email=rnick@gmail.com; name=Robert Nick II, username=rnickTemp34, id=23432, email=rnick@gmail.com; name=Susan Vee, username=sv55, id=443432, email=susanv123@me.com;"

  // code goes here

  var temp = log_dump.split(";");

  var filteredList = mutableListOf<List<String>>()
  for(item in temp){
    if(!item.isEmpty()){
      var filterItem = item.split(",").toMutableList();
      val iterator = filterItem.iterator();
      while(iterator.hasNext()){
        val current = iterator.next();
        if(current.contains("id="))
          iterator.remove()
      }
      
      filteredList.add(filterItem)
    }
  }


 var disctinctList = filteredList.distinct()

  var finalString = StringBuilder()
  for(newItem in disctinctList){
    var count = 0;
      for(subItem in newItem){
        finalString.append(subItem);
        if(count++ != newItem.size -1)
        finalString.append(",");
      }
      finalString.append(";")
  }

   println(finalString)
  return "";

}

fun main() {
  LogDumpGetUnique()
}
