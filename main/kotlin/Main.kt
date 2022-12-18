import kotlin.random.*

/*

    การตรวจสอบชนิดข้อมูลด้วย is และ !is
    - is ตรวจสอบตัวแปรหรืออินสแตนซ์ เป็นชนิดที่ระบุหรือไม่ หากใช้จะคืนค่า true
    - !is จะใช้ในทางตรงกันข้ามคือ หากตัวแปรหรืออินสแตนซ์ ไม่ใช้ชนิดที่ระบุ จะคืนค่า true

    - ทำความรู้จักกับระบบ dependencies ใน Android Apps
    - "Gradle" เป็นภาษาสคริปต์ที่ Google นำมาใช้ Config โปรเจ็กต์ Android Apps
    ที่ได้มาจากโปรแกรม Android Studio เป็นการกำหนดค่าต่างๆ ให้กับโปรเจ็กต์
    Gradle Scripts -> build.gradle (Module: app)

    - compileSdkVersion 30 หมายถึง กำหนดให้ Compile โปรเจ็กต์ด้วยตัวแปลภาษา
    เวอร์ชัน 30

    - buildToolsVersion หมายถึง ต้องการ Build โปรเจ็กต์ของเราด้วยเครื่องมือเวอร์ชั่น
    อะไร จะสอดคล้องกับ compileSdkVersion

    - applicationId หมายถึง ชื่อ Package ของโปรเจ็กต์ปัจจุบัน

    - minSdk คือ กำหนดให้แอปสามารถติดตั้งในระบบปฏิบัติการ Android เวอร์ชันใดบ้าง
    กรณีนี้คือ เวอร์ชั่น 8.0 (API 26 ) ขึ้นไป

    - targetSdk คือ เวอร์ชัน Android ปัจจุบันคือ Android13

    - file -> project structure -> Modules

    - โปรเจ็กต์สมัยใหม่ของ Android App จะใช้ dependencies ที่มีชื่อ Package
    ขึ้นต้นด้วยคำว่า Android x แปลว่าถ้าโปรเจ็กต์ใดก็ตามที่ไม่ได้ใช้ Android x แปล
    ว่าเป็นโปรเจ็กต์ที่สร้างมาจากยุคก่อนหน้านี้

* */


fun main(args: Array<String>) {



}
