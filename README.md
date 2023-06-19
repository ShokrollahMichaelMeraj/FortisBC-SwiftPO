# CMPT-276 Project Proposal

## Project Name: 
SwiftPO x FortisBC Web Application




## First Group Meeting:

During our first group meeting, we had the opportunity to introduce ourselves and get to know each other better. With a team of five members, we engaged in a fruitful discussion to analyze each team member's abilities, backgrounds, and experiences. This allowed us to identify our strengths and areas of expertise, enabling us to determine how best to utilize our skills within the project.

Each member shared their previous experiences related to software engineering, web development, and project management.

## Through open and collaborative dialogue, we identified the following skills and strengths within our team:

- Member 1: Gourav Bhardwaj possesses strong front-end development skills with expertise in HTML, CSS, and JavaScript, in addition to basic knowledge of databases and libraries like React. He also practiced creating a few basic web applications for his portfolio. Gourav will mainly focus on developing the front-end user interface of our application, but will also contribute to the back-end programming as he wants to gain more experience in it.

- Member 2: Shokrollah Michael Meraj possesses foundational front-end development skills with experience in HTML, CSS, and JavaScript. Although his expertise in these languages is still growing, he has actively worked on small personal projects to enhance his knowledge. Regarding back-end development, Michael has worked with PostgreSQL, a popular open-source relational database. As part of his portfolio, he has collaborated with other developers to create landing and login pages for a web based application using react. In the upcoming project, Michael will focus on front-end and back-end development, aiming to create a cohesive user experience and tailor the project to meet customer requirements. Additionally, Michael will be taking on the role of Scrum Master to ensure efficient project management. While his experience in back-end programming is limited, he is determined to expand his knowledge and skills in this area, as he seeks to broaden his expertise in various software development subjects and areas.

- Member 3: Tran Quang Ngoc Cao has a strong foundation in Java and C++, and is willing to learn more about web development and database management. He feels thrilled to learn new skills like front-end designing, communicating and working as a team, etc. He also has experience in working on a project, therefore some of the essential skills for doing a computer science project such as GitHub management, and dividing work between team members are also going to be his crucial contributions to the project.

- Member 4: Hoa An Do has the most basic knowledge of Java, HTML, CSS, and Js. He does not have much experience working on a project; however, he is willing to try his best to contribute to the group. He would love to help with the front-end user interface and also the back-end part, but the most important thing for him is to gain more skills by working as a team, and learning how we have to function in order to meet the requirements of a certain project.  

- Member 5: Anil Kumar is a sharp individual with strong communication and interpersonal skills. He is just starting out his third year in Computing Science and is eager to learn new things in the world of Applied Sciences. His problem-solving skills, along with his knowledge of several programming languages like C++ and Java, will be very useful to this group project. He will be looking to create as much of an impact in the group decisions as possible as he also possesses great leadership and group management qualities which are a few of the most important things to create chemistry and maintain a healthy environment among the group members. 


___

## Abstract:

The SwiftPO (Swift Purchase Order) web application aims to automate the IS (information systems) Consulting Procurement workflow at FortisBC through its’ implementation on the FortisBC Connector website. The application will enable IS users to request a Purchase Order (PO) when engaging with external parties (contractors), and the IS Vendor Management Office (VMO) to respond to the request. Currently, the process involves manually filling up a total of 3 forms, which can be time-consuming and prone to errors. The existing process requires users to fill out a Purchase Requisition form, a Procurement checklist form, and a Sourcing form. This manual data entry process increases the chances of incomplete or inaccurate information being submitted, leading to delays and potential issues during the review and processing stages.

The main purpose of SwiftPO is to automate the process of gathering necessary details, for the PO and ensuring completeness before submission to the IS Vendor Management Office team for review and processing. Our solution will streamline and enhance the efficiency of the procurement workflow. The features of the application will include a user authentication system using Azure AD to identify FortisBC IS users, while also populating the required fields in our application with the help of Microsoft Graph API. Users will be guided through a series of questions to gather all necessary details, while dynamically generating required fields. The application might need to gather necessary vendor details by integrating with SAP or SharePoint. Apart from error-checking and verifying complete information (including project details, contractor information, budget allocation, and contract duration), users and the IS VMO team will be able to track the status of the PO request throughout the workflow stages. Upon completion and approval of all details, the application will generate a Purchase Requisition in SAP for processing. As evident, the application will be used for operational purposes.

___

## Links:
- Web Application: 


- Github Repository: https://github.com/ShokrollahMichaelMeraj/FortisBC-SwiftPO


- Existing systems (APIs):

   - Azure API: https://learn.microsoft.com/en-us/rest/api/azure/
   - 


## Features:


### Authentication and Login via Azure

The login feature in SwiftPO provides secure access for FortisBC IS users. Users can authenticate themselves using their FortisBC-provided credentials through Azure Active Directory. This ensures authorized access to the SwiftPO application, maintaining data confidentiality and protecting against unauthorized access.


## Stories/Scenarios:

1- FortisBC IS user Roger wants to access SwiftPO. He is able to sign into their account by typing his credentials in the authentication form. After their submission, the system will check the input against Azure AD. Upon successful authentication, the user gains access to the application's features and functionalities. If the credentials are invalid, the system should not let the user access the web application. The final goal is for the internal employee can successfully request the product of the company through our landing page.


2- David, an IS team lead, requires a specialized piece of hardware to enhance the network infrastructure. He accesses the IS PO Request page and selects "Electric" as the type of request. He fills in the vendor details, including the legal name, address, and contact information. As it is a new vendor, David ensures that AP is notified to set up the vendor in SAP. He attaches the quotation for the hardware and submits the request. The VMO reviews the request, approves it, and creates a purchase order in SAP. David receives a notification that his request has been processed and the vendor is being engaged.


___
 
## Do we have a clear understanding of the problem?


### How is this problem solved currently (if at all)?



### How will this project make life better? Is it educational or just for entertainment?



### Who is the target audience? Who will use your app or play your game?



## What is the scope of your project?



### Does this project have many individual features or one main feature (a possibility with many subproblems)? These are the ‘epics’ of your project.



### What are some sample stories/scenarios? For example, as a regular user of your site, what types of things can I do?  These are the ‘stories’ of your project.



### Be honest, is the amount of work required in this proposal enough for five group members?

The amount of work required in this proposal is substantial and encompasses various aspects such as system integration, user authentication, dynamic form generation, error-checking, and workflow tracking. With such a diverse and demanding set of tasks, assigning five group members allows for efficient task allocation, collaboration, and effective management of the project's complexity.








