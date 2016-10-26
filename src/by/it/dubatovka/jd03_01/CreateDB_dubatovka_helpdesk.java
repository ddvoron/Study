package by.it.dubatovka.jd03_01;


import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

public class CreateDB_dubatovka_helpdesk {
    private static String dropAd = String.format("DROP TABLE IF EXISTS `dubatovka_helpDesk`.`ad`");
    private static String dropRole = String.format("DROP TABLE IF EXISTS `dubatovka_helpDesk`.`role`");
    private static String dropStatus = String.format("DROP TABLE IF EXISTS `dubatovka_helpDesk`.`status`");
    private static String dropPriority = String.format("DROP TABLE IF EXISTS `dubatovka_helpDesk`.`priority`");
    private static String dropObject = String.format("DROP TABLE IF EXISTS `dubatovka_helpDesk`.`object`");
    private static String dropUsers = String.format("DROP TABLE IF EXISTS `dubatovka_helpDesk`.`users`");

    private static String createUsers = String.format("CREATE TABLE IF NOT EXISTS `dubatovka_helpDesk`.`users` (" +
            "`idUser` INT NOT NULL AUTO_INCREMENT,  `login` VARCHAR(45) NOT NULL,  `password` VARCHAR(20) NOT NULL," +
            "  `email` VARCHAR(45) NULL," +
            "  `fk_role` INT NOT NULL," +
            "  PRIMARY KEY (`idUser`)," +
            "  INDEX `role_idx` (`fk_role` ASC)," +
            "  UNIQUE INDEX `idUser_UNIQUE` (`idUser` ASC)," +
            "  UNIQUE INDEX `login_UNIQUE` (`login` ASC)," +
            "  UNIQUE INDEX `email_UNIQUE` (`email` ASC)," +
            "  CONSTRAINT `fk_role`" +
            "    FOREIGN KEY (`fk_role`)" +
            "    REFERENCES `dubatovka_helpDesk`.`role` (`idRole`)" +
            "    ON DELETE NO ACTION" +
            "    ON UPDATE NO ACTION)" +
            "ENGINE = InnoDB;");

    private static String createRole = String.format("CREATE TABLE role ("
            + "idRole INT NOT NULL AUTO_INCREMENT,"
            + " roleName VARCHAR(20) NOT NULL,"
            + "PRIMARY KEY (idRole));");

    private static String createObject = String.format("CREATE TABLE IF NOT EXISTS `dubatovka_helpDesk`.`object` (" +
            "  `idObject` INT NOT NULL AUTO_INCREMENT," +
            "  `zia` VARCHAR(45) NOT NULL," +
            "  PRIMARY KEY (`idObject`)," +
            "  UNIQUE INDEX `idObject_UNIQUE` (`idObject` ASC)," +
            "  UNIQUE INDEX `zia_UNIQUE` (`zia` ASC))" +
            "ENGINE = InnoDB;");

    private static String createStatus = String.format("CREATE TABLE IF NOT EXISTS `dubatovka_helpDesk`.`status` (" +
            "  `idStatus` INT NOT NULL AUTO_INCREMENT," +
            "  `statusName` VARCHAR(20) NOT NULL," +
            "  PRIMARY KEY (`idStatus`)," +
            "  UNIQUE INDEX `idStatus_UNIQUE` (`idStatus` ASC)," +
            "  UNIQUE INDEX `statuscol_UNIQUE` (`statusName` ASC))" +
            "ENGINE = InnoDB;");

    private static String createPriority = String.format("CREATE TABLE IF NOT EXISTS `dubatovka_helpDesk`.`priority` (" +
            "  `idPriority` INT NOT NULL AUTO_INCREMENT," +
            "  `priorityName` VARCHAR(10) NOT NULL," +
            "  PRIMARY KEY (`idPriority`)," +
            "  UNIQUE INDEX `idPriority_UNIQUE` (`idPriority` ASC)," +
            "  UNIQUE INDEX `priorityName_UNIQUE` (`priorityName` ASC))" +
            "ENGINE = InnoDB;");

    private static String createAd = String.format("CREATE TABLE IF NOT EXISTS `dubatovka_helpDesk`.`ad` (" +
            "  `idAd` INT NOT NULL AUTO_INCREMENT," +
            "  `subject` VARCHAR(45) NOT NULL," +
            "  `description` VARCHAR(300) NULL," +
            "  `fk_zia` INT NOT NULL," +
            "  `fk_user` INT NOT NULL," +
            "  `fk_status` INT NOT NULL," +
            "  `fk_priority` INT NOT NULL," +
            "  PRIMARY KEY (`idAd`)," +
            "  INDEX `fk_user_idx` (`fk_user` ASC)," +
            "  INDEX `fk_zia_idx` (`fk_zia` ASC)," +
            "  INDEX `fk_status_idx` (`fk_status` ASC)," +
            "  UNIQUE INDEX `idAd_UNIQUE` (`idAd` ASC)," +
            "  INDEX `fk_priority_idx` (`fk_priority` ASC)," +
            "  CONSTRAINT `fk_user`" +
            "    FOREIGN KEY (`fk_user`)" +
            "    REFERENCES `dubatovka_helpDesk`.`users` (`idUser`)" +
            "    ON DELETE NO ACTION" +
            "    ON UPDATE NO ACTION," +
            "  CONSTRAINT `fk_zia`" +
            "    FOREIGN KEY (`fk_zia`)" +
            "    REFERENCES `dubatovka_helpDesk`.`object` (`idObject`)" +
            "    ON DELETE NO ACTION" +
            "    ON UPDATE NO ACTION," +
            "  CONSTRAINT `fk_status`" +
            "    FOREIGN KEY (`fk_status`)" +
            "    REFERENCES `dubatovka_helpDesk`.`status` (`idStatus`)" +
            "    ON DELETE NO ACTION" +
            "    ON UPDATE NO ACTION," +
            "  CONSTRAINT `fk_priority`" +
            "    FOREIGN KEY (`fk_priority`)" +
            "    REFERENCES `dubatovka_helpDesk`.`priority` (`idPriority`)" +
            "    ON DELETE NO ACTION" +
            "    ON UPDATE NO ACTION)" +
            "ENGINE = InnoDB;");


    public static void main(String[] args) {

        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            Connection connection = DriverManager.getConnection(CN.URL_DB, CN.USER_DB, CN.PASSWORD_DB);
            Statement statement = connection.createStatement();
            //удаляем таблицы
            if (!connection.isClosed()) {
                System.out.println("Соединение установлено");
                statement.executeUpdate(dropAd);
                System.out.println("dropAd");
                statement.executeUpdate(dropUsers);
                System.out.println("dropUsers");
                statement.executeUpdate(dropRole);
                System.out.println("dropRole");

                statement.executeUpdate(dropStatus);
                System.out.println("dropStatus");
                statement.executeUpdate(dropPriority);
                System.out.println("dropPriority");
                statement.executeUpdate(dropObject);
                System.out.println("dropObject");

//создаем таблицы
                statement.executeUpdate(createPriority);
                System.out.println("CreatePriority");
                statement.executeUpdate(createRole);
                System.out.println("CreateRole");
                statement.executeUpdate(createObject);
                System.out.println("CreateObject");
                statement.executeUpdate(createStatus);
                System.out.println("CreateStatus");

                statement.executeUpdate(createUsers);
                System.out.println("CreateUsers");
                statement.executeUpdate(createAd);
                System.out.println("CreateAd");
                statement.close();
            } else System.out.println("отсутствует соединение!");

            //заполнение таблиц
            //    FillTable.filltable();
            connection.close();
            System.out.println("Соединение закрыто");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}