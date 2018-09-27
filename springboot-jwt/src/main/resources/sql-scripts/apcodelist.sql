CREATE TABLE `apCodeList` ( 
	`keyId` BIGINT(20) NOT NULL , 
	`codeListType` CHAR(20) NOT NULL , 
	`codeValue` CHAR(10) NOT NULL , 
	`codeDesc` CHAR(100) NOT NULL , 
	PRIMARY KEY (`keyId`));

INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('1', 'userType', 'I', 'Individual');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('2', 'userType', 'O', 'Organization');

INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('3', 'roleCode', 'IU', 'Individual User');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('4', 'roleCode', 'AD', 'Admin');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('5', 'roleCode', 'TM', 'Travelyatri Maker');

INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('6', 'dataFetchType', 'R', 'Real Time');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('7', 'dataFetchType', 'B', 'Batch');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('8', 'dataFetchType', 'M', 'Manual');

INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('9', 'gender', 'M', 'Male');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('10', 'gender', 'F', 'Female');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('11', 'gender', 'X', 'Transgender');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('12', 'gender', 'N', 'Decline');

INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('13', 'tourType', 'G', 'Group');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('14', 'tourType', 'S', 'Speciality');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('15', 'tourType', 'E', 'Economy');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('16', 'tourType', 'T', 'Tailormade');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('17', 'tourType', 'C', 'Corporate');

INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('18', 'tourTag', 'WT', 'Weekend Tour');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('19', 'tourTag', 'H', 'Honeymoon');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('20', 'tourTag', 'S', 'Spiritual');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('21', 'tourTag', 'A', 'Adventure');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('22', 'tourTag', 'WS', 'Women Special');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('23', 'tourTag', 'SC', 'Senior Citizen');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('24', 'tourTag', 'ST', 'Student');

INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('25', 'occupation', 'ST', 'Student');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('26', 'occupation', 'EM', 'Employee');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('27', 'occupation', 'GE', 'Govt Employee');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('28', 'occupation', 'SE', 'Self Employeed');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('29', 'occupation', 'OT', 'Other');

INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('30', 'relationCode', 'AR', 'Aggregator');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('31', 'relationCode', 'TP', 'Tour Provider');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('32', 'relationCode', 'EU', 'End User');

INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('33', 'salarySlab', 'SS1', '> 5 LPA');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('34', 'salarySlab', 'SS2', '5 - 10 LPA');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('35', 'salarySlab', 'SS3', '10 - 15 LPA');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('36', 'salarySlab', 'SS4', '> 15 LPA');

INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('37', 'dayStatus', 'W', 'Weekend');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('38', 'dayStatus', 'B', 'Bank Holiday');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('39', 'dayStatus', 'D', 'Declared Holiday');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('40', 'dayStatus', 'M', 'Misc Holiday');

INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('41', 'context', 'MNVO', 'Mobile Number Verification OTP');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('42', 'context', 'EIVU', 'Email Verification Link');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('43', 'context', 'WLCM', 'Welcome Message');

INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('44', 'stateCode', 'MH', 'Maharashtra');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('45', 'stateCode', 'WB', 'West Bengal');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('46', 'stateCode', 'TL', 'Telangana');
INSERT INTO `apcodelist` (`keyId`, `codeListType`, `codeValue`, `codeDesc`) VALUES ('47', 'stateCode', 'ND', 'New Delhi');