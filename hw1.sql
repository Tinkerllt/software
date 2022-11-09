-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hw1
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cinema`
--

DROP TABLE IF EXISTS `cinema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `cinema` (
  `cinema_id` int NOT NULL AUTO_INCREMENT,
  `cinema_name` varchar(20) NOT NULL DEFAULT 'untitled',
  `enable_or_not` tinyint(1) NOT NULL DEFAULT '1',
  `cinema_address` varchar(50) NOT NULL DEFAULT '空',
  `cinema_location_of_city` varchar(30) NOT NULL DEFAULT '空',
  PRIMARY KEY (`cinema_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT NULL,
  PRIMARY KEY (`movie_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie`
--

LOCK TABLES `movie` WRITE;
/*!40000 ALTER TABLE `movie` DISABLE KEYS */;
INSERT INTO `movie` VALUES (1,'毒液：致命守护者','107分钟','2022-08-09','2022-09-09',0,'记者埃迪·布洛克（汤姆·哈迪 饰）在调查生命基金会的最新科学实验过程中，受到不明外星物质共生体的入侵与控制，历经挣扎成为亦正亦邪的超级英雄——毒液。他将以毒攻毒，破解生命基金会的惊天阴谋，拯救世界。'),(2,'神奇动物：格林德沃之罪','125分钟','2022-09-16','2022-12-16',0,'在《神奇动物在那里》第一部的结尾，纽特·斯卡曼德（埃迪·雷德梅恩 饰）协助美国魔法国会，将强大的黑巫师盖勒特·格林德沃（约翰尼·德普 饰）抓捕归案。但格林德沃不久便兑现狂言成功越狱，并开始纠集信徒，着手实现他们的邪恶目的：让纯血统的巫师成为统治阶层，镇压一切非魔法生物。为挫败格林德沃的阴谋，阿不思·邓布利多（裘德·洛 饰）向昔日的学生纽特·斯卡曼德寻求帮助。纽特欣然允诺，却没有意识到，他将踏上的会是一段充满艰险的未来征途。此时的魔法世界面临空前的分裂乱局，阶层鸿沟日益加深，爱与忠诚备受考验，至亲好友也可能反目成仇……'),(3,'无名之辈','117分钟','2022-09-16','2022-12-17',0,'在一座山间小城中，一对低配劫匪、一个落魄的泼皮保安、一个身体残疾却性格彪悍的残毒舌女以及一系列生活在社会不同轨迹上的小人物，在一个貌似平常的日子里，因为一把丢失的老枪和一桩当天发生在城中的乌龙劫案，从而被阴差阳错地拧到一起，发生的一幕幕令人啼笑皆非的荒诞喜剧。'),(4,'名侦探柯南：零的执行人','118分钟','2022-09-17','2022-12-16',0,'5月1日，东京湾边的新建筑“海洋边缘”将举办首脑云集的东京峰会。然而，峰会开办前一周，会场发生超大规模的爆炸事件，并出现了安室透的身影。疑似恐怖袭击的事件引起了警察部门的严肃调查。在警察局大型搜查会议上，公安部门提交证物，却发现疑犯指纹与毛利小五郎（小山力也 配音）指纹吻合。作为律师的妃英理努力收集证据证明丈夫的无辜，却无力阻止毛利小五郎被收监。看到毛利兰（山崎和佳奈 配音）绝望哭泣的样子，柯南（高山南 配音）决定调查事件真相，还毛利小五郎清白。另一方面，少年侦探团的孩子们正紧密关注着无人探测器“天鹅”的回航任务。行踪诡异的安室透、惨遭陷害的毛利小五郎、错综复杂的警察部门、即将着陆的无人探测器；随着“机密任务”进入倒计时，关乎整个东京的可怕计划拉开帷幕…'),(5,'你好，之华','95分钟','2022-11-15','2023-01-15',0,'有人慌张得见面，有人简单地告别。姐姐袁之南离世的那个清晨，只匆匆留下一封信和一张同学会邀请函。妹妹之华(周迅 饰)代替姐姐参加，却意外遇见年少时的倾慕对象尹川（秦昊 饰）。往日的记忆在苏醒，但再次相见，已物是人非。'),(6,'恐龙王','100分钟','2022-07-15','2022-12-15',0,'陆地霸主特暴龙“斑大师”和自己的小儿子“小疙瘩”生活在一起。“小疙瘩”自幼失去了母亲，生性懦弱，严厉的“斑大师”虽然心底十分疼爱自己的孩子，但是急于让“小疙瘩”成长为新的陆地霸主，常常忍不住责骂“小疙瘩”，父子俩虽然相依为命，却始终有一些隔阂。 一天“小疙瘩”被几只邪恶的恐爪龙抓走，“斑大师”踏上漫漫的寻子之路，路途中他结识了有高度近视眼的美甲龙“八百度”，两人穿过“巨蝎峡”、走出“长颈龙绿洲”、踏上火山峡谷，经历了重重难关。而身处险境的“小疙瘩”也结识了一些新的朋友，并且开始和邪恶的恐爪龙斗智斗勇。最终父子两人终于相见，但是却不得不一起面对一个更加凶恶的史前怪物……'),(7,'冰封侠:时空行者','102分钟','2022-08-16','2022-12-17',0,'明朝大将军贺英（甄子丹 饰）利用时空金球终于重返明朝，与锦衣卫兄弟萨獒（王宝强 饰）获悉了倭寇和朝廷奸党之间足以倾覆皇权的密谋，绵延400年的惊天危机一触即发。贺英也在红颜知己小美（黄圣依 饰）的帮助下开始了抗倭锄奸和保护族人的战斗。'),(8,'梦境之源','103分钟','2022-08-13','2022-12-12',0,'货车司机李昂由于童年时代内向懦弱，颓废度日，频频做噩梦，严重影响了正常的生活，并因此不得不接受心理医生曹井润的催眠治疗，却在梦境中意外卷入一场凶杀案。睿智破案的警探成为凶手，而真正的幕后黑手仍在逍遥法外……');
/*!40000 ALTER TABLE `moviDEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cinema`
--

LOCK TABLES `cinema` WRITE;
/*!40000 ALTER TABLE `cinema` DISABLE KEYS */;
INSERT INTO `cinema` VALUES (1,'金逸国际影城(碣阳大街店)',1,'地址：昌黎县碣阳大街北侧民生路东(民生广场商业楼二楼)','成都'),(2,'金逸影城(海港店)',1,'地址：海港区太阳城正阳街5号乐都汇购物广场四楼','成都'),(3,'中影国际影城(秦皇新天地店)',1,'地址：海港区秦皇岛开发区秦皇西大街88号（秦皇新天地商业街2号楼3层）','成都'),(4,'金棕榈国际电影城',1,'地址：海港区秦皇东大街80号文化广场剧场（近秦皇岛市图书馆、聚贤人才市场）','成都'),(5,'大地影院(世纪港湾店)',1,'地址：海港区秦皇东大街世纪港湾广场B栋3层（世纪港湾商业广场）','成都'),(6,'蓝图影城',1,'地址：海港区杜庄镇蓝图国际影城','杭州'),(7,'北戴河影谷影院',1,'地址：北戴河区联峰北路80号（北戴河舌尖美食城）','杭州'),(8,'中影星美银之谷店',1,'地址：海港区康乐街25号人民广场（人民公园正门对面）','杭州'),(9,'东购影城',1,'地址：抚宁区东购商场5楼','杭州'),(10,'昌黎广缘电影城(碣阳大街店)',0,'地址：昌黎县碣阳大街与五峰山路交叉口广缘超市5楼（广缘超市5楼）','杭州'),(11,'龙城国际影院',1,'地址：青龙满族自治县龙城购物广场三楼','内蒙古'),(12,'213131',1,'2131','杭州');
/*!40000 ALTER TABLE `cinema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `movie` (
  `movie_id` int NOT NULL AUTO_INCREMENT,
  `movie_name` varchar(30) NOT NULL,
  `movie_duration` varchar(20) NOT NULL,
  `release_date` date DEFAULT NULL,
  `end_date` date DEFAULT NULL,
  `hidden_or_not` tinyint(1) DEFAULT NULL,
  `movie_info` varchar(500) e` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `session`
--

DROP TABLE IF EXISTS `session`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `session` (
  `session_id` int NOT NULL AUTO_INCREMENT,
  `movie_id` int NOT NULL,
  `cinema_id` int NOT NULL,
  `screening_date` date NOT NULL,
  `start_time` time NOT NULL,
  `hall_name` varchar(30) NOT NULL,
  PRIMARY KEY (`session_id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `session`
--

LOCK TABLES `session` WRITE;
/*!40000 ALTER TABLE `session` DISABLE KEYS */;
INSERT INTO `session` VALUES (1,2,1,'2022-11-09','00:00:00','1号厅'),(2,2,3,'2022-11-09','00:30:00','1号厅'),(3,3,5,'2022-11-09','01:00:00','1号厅'),(4,4,7,'2022-11-09','01:30:00','1号厅'),(5,3,11,'2022-11-09','02:00:00','1号厅'),(6,6,2,'2022-11-09','02:30:00','1号厅'),(7,7,4,'2022-11-09','03:00:00','1号厅'),(8,8,6,'2022-11-09','03:30:00','1号厅'),(9,4,8,'2022-11-09','04:00:00','1号厅'),(10,2,10,'2022-11-09','04:30:00','1号厅'),(11,3,3,'2022-11-09','05:00:00','1号厅'),(12,4,4,'2022-11-09','05:30:00','1号厅'),(13,6,5,'2022-11-09','06:00:00','1号厅'),(14,6,6,'2022-11-09','06:30:00','1号厅'),(15,7,1,'2022-11-09','07:00:00','1号厅'),(16,8,2,'2022-11-09','07:30:00','1号厅'),(17,7,7,'2022-11-09','08:00:00','1号厅'),(18,2,8,'2022-11-09','08:30:00','1号厅'),(19,3,9,'2022-11-09','09:00:00','1号厅'),(20,4,11,'2022-11-09','09:03:00','1号厅'),(21,8,10,'2022-11-09','10:00:00','1号厅'),(22,6,2,'2022-11-09','10:30:00','1号厅'),(23,7,3,'2022-11-09','11:00:00','1号厅'),(24,8,4,'2022-11-09','11:30:00','1号厅'),(25,1,2,'2022-08-11','00:00:00','2号厅'),(26,1,2,'2022-08-11','00:00:00','2号厅'),(27,1,2,'2022-08-11','00:00:00','2号厅'),(28,1,2,'2022-08-11','00:00:00','2号厅');
/*!40000 ALTER TABLE `session` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT COMMENT 'Key',
  `name` varchar(30) NOT NULL COMMENT '用户名',
  `password` varchar(30) NOT NULL COMMENT '密码',
  `email` varchar(30) NOT NULL COMMENT '邮箱',
  `role` int NOT NULL COMMENT '角色(1表示管理员, 0 表示用户)',
  `headImg` varchar(30) DEFAULT NULL COMMENT '头像路径',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','123','365166709@qq.com',1,'img/head/admin.jpg'),(2,'fyf','123','2569548856@qq.com',0,'img/head/fyf.jpg'),(3,'张茂森','123','zms@qq.com',0,'img/head/zms.jpg'),(4,'刘阳','123','liuyang@163.com',0,'img/head/ly.jpg'),(5,'王可可','123','wangkeke@qq.com',0,'img/head/wkk.jpg'),(6,'Monster6697','123','Monster6697@163.com',0,'img/head/user_id6.jpg'),(7,'草木灰011','123','cmh123@sina.com',0,'img/head/user_id7.jpg'),(8,'JuliaFanl','123','JuliaFanl@163.com',0,'img/head/user_id8.jpg'),(9,'A名犬乐园 （定金选狗）款到发货','666','ams5864@qq.com',0,'img/head/user_id9.jpg'),(10,'宝贝','520','baobei520@163.com',0,'img/head/user_id10.jpg'),(11,'洋洋','789xxx','yangyangxinglang@sina.com',0,'img/head/user_id11.jpg'),(12,'Misterlonely','mister233','Misterlonely233@163.com',0,'img/head/user_id12.jpg'),(13,'96年的康师傅','123','kshfu96@qq.com',0,'img/head/kjg.jpg');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-08 19:18:47
