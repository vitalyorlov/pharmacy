<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>Drugs</title>
</head>
<body>
<h1>All drugs</h1> <br>
<s:if test="list.size() > 0">
    <div>
        <table cellpadding="5px" border="1">
            <tr>
                <th>Id</th>
                <th>Type id</th>
                <th>Name</th>
                <th>Instruction</th>
                <th>Age Restriction</th>
            </tr>

            <s:iterator value="list">
                <tr>
                    <td><s:property value="id"/></td>
                    <td><s:property value="typeId"/></td>
                    <td><s:property value="name"/></td>
                    <td><s:property value="instruction"/></td>
                    <td><s:property value="ageRestrict"/>+</td>
                    <td><s:url id="deleteURL" action="deletedrug">
                    <s:param name="id" value="%{id}"></s:param>
                </s:url>
                    <s:a href="%{deleteURL}" onclick="return confirm('Are you sure?')">Delete</s:a></td>
                    <td><s:url id="editURL" action="drugedit">
                        <s:param name="id" value="%{id}"></s:param>
                    </s:url>
                        <s:a href="%{editURL}">Edit</s:a></td>
                </tr>
            </s:iterator>
        </table>
        <a href="/superuser/createdrug.action">Create New</a>
    </div>
</s:if>
<s:if test="list.size() = 0">
    <h1>The list is empty yet.</h1>
</s:if>
<s:actionerror/>
</body>
</html>
