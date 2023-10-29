package bootstrapp

class BootStrap {

    def init = { servletContext ->
     new Book(name:"jungle",price:180).save()
     new Book(name:"Math",price:234).save()
     new Book(name:"Biology",price:134).save()
     new Book(name:"Physics",price:23).save()
    }
    def destroy = {
    }
}
