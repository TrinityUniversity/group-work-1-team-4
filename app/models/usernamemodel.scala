case class Person(name: String, friends: Array[String])

object StudentData {
  val raw = """Paul Abila,bmalik,mbarton,dclaesse,hfulton,khardee,emiller6,cweisenb
Joseph Baker,mbarton,mcartwri,afeleke,thall,jkibet,emiller6,ctatu
Matthew Barton,pabila,kcrusius,rfernan3,khardee,tlauerma,athakar,cweisenb
Morgan Cartwright,jbaker6,kcrusius,afeleke,jkibet,eruetsch,cyoung5
Dane Claessen,pabila,mcartwri,cfagerst,khardee,tlauerma,ctatu,cweisenb
Kevin Crusius,bmalik,jbaker6,dclaesse,thall,rhuynh1,eruetsch,swhitney
Chet Fagerstrom,mcartwri,kcrusius,afeleke,khardee,vriosrio,awalker3
Aaron Feleke,pabila,mcartwri,rfernan3,mrosen0,emiller6,espradli,cyoung5
Ryan Fernandez,jbaker6,cfagerst,hfulton,thall,tlauerma,eruetsch
Hans Fulton,pabila,mbarton,cfagerst,mrosen0,rhuynh1,jrosser,cweisenb
Turner Hall,mcartwri,kcrusius,afeleke,mrosen0,emiller6,ctatu,swhitney
Morgen Halle,bmalik,jbaker6,kcrusius,hfulton,tlauerma,athakar,cyoung5
Kurt Hardee,pabila,mcartwri,rfernan3,thall,jkibet,jrosser,awalker3
Raini Huynh,jbaker6,mbarton,dclaesse,thall,jkibet,eruetsch,awalker3
Jazmine Kibet,mcartwri,kcrusius,rfernan3,mrosen0,vriosrio,ctatu,cweisenb
Thomas Lauerman,pabila,mbarton,afeleke,mrosen0,emiller6,espradli,cyoung5
Benjamin Malik,dclaesse,cfagerst,rfernan3,rhuynh1,vriosrio,awalker3
Emma Miller,bmalik,pabila,cfagerst,afeleke,jkibet,jrosser,athakar,swhitney
Vasti Sarai Rios Rios,mbarton,mcartwri,hfulton,vriosrio,espradli,cweisenb
James Rosser,jbaker6,mcartwri,kcrusius,thall,rhuynh1,eruetsch,awalker3
Lizzie Ruetschle,pabila,jbaker6,afeleke,mrosen0,khardee,jrosser,awalker3,cweisenb
Emerson Spradling,mbarton,kcrusius,hfulton,thall,rhuynh1,espradli
Christian Tatu,dclaesse,cfagerst,afeleke,mrosen0,rhuynh1,eruetsch,swhitney
Arjun Thakar,bmalik,mcartwri,kcrusius,hfulton,khardee,vriosrio,athakar
Alex Walker,pabila,mcartwri,cfagerst,afeleke,mrosen0,tlauerma,ctatu,cyoung5
Connor Weisenberger,jbaker6,mbarton,dclaesse,thall,khardee,espradli,swhitney
Sabrina Whitney,jbaker6,dclaesse,kcrusius,afeleke,rhuynh1,eruetsch,cyoung5
Caden Young,pabila,mbarton,dclaesse,cfagerst,thall,khardee,vriosrio,awalker3"""
  val data = raw.split("\n").map { line =>
    val p = line.split(",")
    Person(p.head, p.tail.map(_.t0String))
  }
}