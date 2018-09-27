CREATE TABLE `user` ( 
	`userId` BIGINT(20) NOT NULL , 
	`username` CHAR(25) NOT NULL , 
	`unameVerifiedYN` CHAR(1) NOT NULL , 
	`emailId` CHAR(25), 
	`emailVerifiedYN` CHAR(21), 
	`userType` CHAR(1) NOT NULL, 
	`name` CHAR(50) NOT NULL, 
	`rating` FLOAT(1), 
	`countryCode` CHAR(3), 
	`languageCode` CHAR(3),  
	PRIMARY KEY (`userId`)); 
	
CREATE TABLE `userRole` ( 
	`userId` BIGINT(20) NOT NULL , 
	`roleCode` CHAR(2) NOT NULL,
	CONSTRAINT FK894283hjhfkdjfhjo32970309420 FOREIGN KEY (userId) REFERENCES user (userId)
);

	
CREATE TABLE `individualUser` ( 
	`userId` BIGINT(20) NOT NULL, 
	`title` CHAR(5),
	`firstName` CHAR(20) NOT NULL,
	`middleName` CHAR(20),
	`lastName` CHAR(20),
	`profilePicId` BIGINT(20),
	`gender` CHAR(1) NOT NULL ,
	`dob` DATETIME,
	`occupation` CHAR(2),
	`salary` CHAR(3),
	`addressId` BIGINT(20),
	`deviceId` BIGINT(20),
	`currentLat` DECIMAL(10,8),
	`currentLong` DECIMAL(11,8),
	`nriYN` CHAR(1)
	CONSTRAINT FK894283hjhfkdjfhjo32970309420 FOREIGN KEY (userId) REFERENCES user (userId) UNIQUE
);


INSERT INTO `user` (`userId`, `username`, `unameVerifiedYN`, `emailId`, `emailVerifiedYN`, `userType`, `name`, `rating`, `countryCode`, `languageCode`) 
		VALUES ('1', '918983189247', 'Y', 'jalispran@gmail.com', 'N', 'I', 'Pranjal Gore', '4.7', 'IN', 'en');
		
INSERT INTO `userRole` (`userId`, `roleCode`) VALUES ('1', 'AD');