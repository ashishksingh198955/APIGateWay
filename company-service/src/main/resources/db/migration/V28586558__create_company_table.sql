CREATE TABLE `companyinfo` (
    `companyid` INT(4) NOT NULL AUTO_INCREMENT COMMENT 'Auto generated key ',
    `companyname` VARCHAR(100)CHARACTER SET UTF8MB4 COLLATE UTF8MB4_0900_AI_CI NOT NULL COMMENT ' name of the company ',
    `companywebsite` VARCHAR(150) DEFAULT NULL,
     `companyaddress` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT ' Company Address  ',

    `companysize` INT(4) DEFAULT '0' COMMENT 'Refers ID in companyinfo table. Indicates who has registered this company ',
    `createdby` INT(4) NOT NULL DEFAULT '0' COMMENT 'Refers ID in companyinfo table. Indicates who has registered this company ',
    `createdatetime` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT 'Date on which the record was created ',
    PRIMARY KEY (`companyid`)
)  ENGINE=INNODB AUTO_INCREMENT=114 DEFAULT CHARSET=UTF8MB4 COLLATE = UTF8MB4_0900_AI_CI COMMENT='This table consist of profile information related to company-information. ';