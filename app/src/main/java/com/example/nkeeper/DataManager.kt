package com.example.nkeeper

class DataManager {
    val courses = HashMap< String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents","andr prog with intents")
        courses.set(course.courseId, course)
        course = CourseInfo(courseId = "andr_sync",title = "async programming")
        courses.set(course.courseId, course)
        course = CourseInfo("android_2","andr prog 2")
        courses.set(course.courseId, course)
        course = CourseInfo(courseId = "andr_sync2",title = "async programming2")
        courses.set(course.courseId, course)
    }
}