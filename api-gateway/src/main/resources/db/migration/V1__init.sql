CREATE TABLE `userprofileinfo` (
  `userprofileinfoid` int(4) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(50) NOT NULL,
  `middlename` varchar(50) DEFAULT NULL,
  `lastname` varchar(50) NOT NULL,
  `gender` varchar(15) DEFAULT NULL,
  `position` varchar(50) DEFAULT NULL,
  `contact` varchar(15) NOT NULL,
  `division` varchar(50) DEFAULT NULL,
  `email` varchar(60) NOT NULL,
  `password` varchar(250) DEFAULT NULL,
  `companyid` varchar(4) DEFAULT NULL,
  `createdby` int(4) DEFAULT '0',
  `createdatetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Date on which the record was created ',
  `auditedby` int(4) DEFAULT '0',
  `auditeddatetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'Date on which the record was updated ',
  `status` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`userprofileinfoid`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `rolemaster` (
    `roleid` INT(4) NOT NULL AUTO_INCREMENT COMMENT 'AUTO GENERATED KEY',
    `rolename` VARCHAR(30)CHARACTER SET UTF8MB4 COLLATE UTF8MB4_0900_AI_CI NOT NULL COMMENT 'Possible values are  
    SYSTEM ADMIN 
    COMPANY ADMIN 
    COMPANY HR
    EMPLOYEE',
    PRIMARY KEY (`roleid`)
)  ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='This table consist of roles in the system. This is a master table ';


CREATE TABLE IF NOT EXISTS `userroles` (
    `userrolesid` INT(4) NOT NULL AUTO_INCREMENT COMMENT 'AUTO GENERATED KEY',
    `userprofileinfoid` INT(4) NOT NULL COMMENT 'Refers ID in UserProfileInfo',
    `roleid` INT(4) NOT NULL COMMENT 'Refers ID in RoleMaster',
    `isactive` TINYINT(4) NOT NULL DEFAULT '1' COMMENT 'Default True (1), 
    We can de-active the user roles ',
    `companyid` INT(4) DEFAULT '0' COMMENT 'Reference id of companyinfo table ',
    PRIMARY KEY (`userrolesid`),
    KEY `userroles_rolemasterid_idx` (`roleid`),
    KEY `userroles_userprofileinfoid_idx` (`userprofileinfoid`),
    CONSTRAINT `userroles_rolemasterid` FOREIGN KEY (`roleid`)
        REFERENCES `rolemaster` (`roleid`),
    CONSTRAINT `userroles_userprofileinfoid` FOREIGN KEY (`userprofileinfoid`)
        REFERENCES `userprofileinfo` (`userprofileinfoid`)
)  ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='This table consist a role of given to the user. ';





INSERT INTO `rolemaster` (`rolename`) VALUES ('ROLE_SYSTEM_ADMIN');
INSERT INTO `rolemaster` (`rolename`) VALUES ('ROLE_COMPANY_ADMIN');
INSERT INTO `rolemaster` (`rolename`) VALUES ('ROLE_COMPANY_HR');
INSERT INTO `rolemaster` (`rolename`) VALUES ('ROLE_EMPLOYEE');






