<%@page import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<jsp:include page="/WEB-INF/views/templates/header/front.jsp" />
<c:set var="today" value="<%=new Date()%>"></c:set>

<div class="container-fluid">
	<div class="quick-actions_homepage">
		<ul class="quick-actions">
			<li class="bg_lb"><a href="#"> <i class="icon-dashboard"></i>
					<span class="label label-important">${studentActivities}</span>Activities
			</a></li>
			<li class="bg_lg"><a href="charts.html"> <i
					class="icon-signal"></i><span class="label label-important">${studentProposals}</span> Proposals
			</a></li>
			<li class="bg_ly"><a href="widgets.html"> <i
					class="icon-inbox"></i><span class="label label-important">${studentQuotations}</span>
					Quotations
			</a></li>
			<li class="bg_lo"><a href="tables.html"> <i class="icon-th"></i>
					<span class="label label-important">${studentReports}</span>Reports
			</a></li>
			<li class="bg_lo"><a href="form-common.html"> <i
					class="icon-th-list"></i><span class="label label-important">${studentResults}</span>Results
			</a></li>
			<li class="bg_ls"><a href="buttons.html"> <i
					class="icon-tint"></i><span class="label label-important">${studentMerits}</span>Merits
			</a></li>

		</ul>
	</div>
	<!--End-Action boxes-->

	<!--Chart-box-->
	<!-- <div class="row-fluid">
		<div class="widget-box">
			<div class="widget-title bg_lg">
				<span class="icon"><i class="icon-signal"></i></span>
				<h5>Site Analytics</h5>
			</div>
			<div class="widget-content">
				<div class="row-fluid">
					<div class="span9">
						<div>
							class="chart"
						</div>
					</div>
					<div class="span3">
						<ul class="site-stats">
							<li class="bg_lh"><i class="icon-user"></i> <strong>2540</strong>
								<small>Total Users</small></li>
							<li class="bg_lh"><i class="icon-plus"></i> <strong>120</strong>
								<small>New Users </small></li>
							<li class="bg_lh"><i class="icon-shopping-cart"></i> <strong>656</strong>
								<small>Total Shop</small></li>
							<li class="bg_lh"><i class="icon-tag"></i> <strong>9540</strong>
								<small>Total Orders</small></li>
							<li class="bg_lh"><i class="icon-repeat"></i> <strong>10</strong>
								<small>Pending Orders</small></li>
							<li class="bg_lh"><i class="icon-globe"></i> <strong>8540</strong>
								<small>Online Orders</small></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div> -->
	<!--End-Chart-box-->
	<hr />
	<div class="row-fluid">
		<div class="span6">
			<div class="widget-box">
				<div class="widget-title bg_ly" data-toggle="collapse"
					href="#collapseActivities">
					<span class="icon"><i class="icon-chevron-down"></i></span>
					<h5>Latest Community Engagements</h5>
				</div>
				<div class="widget-content nopadding collapse in"
					id="collapseActivities">
					<ul class="recent-posts">
						<c:if test="${not empty latestActivities}">
							<c:forEach items="${latestActivities}" var="activity">
								<li>
									<div class="user-thumb">
										<img width="40" height="40" alt="User" src="img/demo/av1.jpg">
									</div>
									<div class="article-post">
										<span class="user-info"> By: ${activity.orgarnizer} /
											Date: ${activity.dateOfActivity} </span> <span class="user-info">
											<h5>Institution: ${activity.tertiaryInstitution}</h5>
										</span>
										<p>
											<a href="#">${activity.activityName}</a>
										</p>
									</div>
								</li>
							</c:forEach>
						</c:if>
						<c:if test="${empty latestActivities}">
							<li class="clearfix">
								<div class="txt">
									No recent Community Engagement present yet<span
										class="by badge badge-warning">No Activities</span>
								</div>
								<div class="pull-right">
									<a class="tip" href="#" title="Edit Task"><i
										class="icon-pencil"></i></a> <a class="tip" href="#"
										title="Delete"><i class="icon-remove"></i></a>
								</div>
							</li>
						</c:if>
					</ul>
				</div>
			</div>


			<div class="widget-box">
				<div class="widget-title" data-toggle="collapse"
					href="#collapseProposals">
					<span class="icon"><i class="icon-ok"></i></span>
					<h5>Latest Approved Proposals</h5>
				</div>
				<div class="widget-content nopadding collapse in">
					<div class="todo" id="collapseProposals">
						<ul>

							<c:if test="${not empty proposalList}">
								<c:forEach items="${proposalList}" var="proposal">
									<li class="clearfix">
										<div class="txt">
											${proposal.proposalDescription}<span class="by label">${proposal.student.name}&nbsp;${proposal.student.surname}</span>
										</div>
										<div class="pull-right">
											<a class="tip" href="#" title="Edit Task"><i
												class="icon-pencil"></i></a> <a class="tip" href="#"
												title="Delete"><i class="icon-remove"></i></a>
										</div>
									</li>
								</c:forEach>
							</c:if>
							<c:if test="${empty proposalList}">
								<ul class="recent-posts">
									<li class="clearfix">
										<div class="txt">
											No latest Approved Proposals present yet<span
												class="by badge badge-warning">No Proposals</span>
										</div>
										<div class="pull-right">
											<a class="tip" href="#" title="Edit Task"><i
												class="icon-pencil"></i></a> <a class="tip" href="#"
												title="Delete"><i class="icon-remove"></i></a>
										</div>
									</li>
								</ul>
							</c:if>
						</ul>
					</div>
				</div>
			</div>

			<div class="widget-box">
				<div class="widget-title bg_lo" data-toggle="collapse"
					href="#collapseUpdates">
					<span class="icon"> <i class="icon-chevron-down"></i>
					</span>
					<h5>News, Meetings, Activities and Social updates</h5>
				</div>
				<div class="widget-content nopadding updates collapse in"
					id="collapseUpdates">
					<div class="new-update clearfix">
						<c:choose>
							<c:when test="${not empty updatesList}">
								<c:forEach items="${updatesList}" var="update">
									<i class="icon-ok-sign"></i>
									<div class="update-done">
										<a title="" href="#"><strong>${update.updateTitle}</strong></a>
										<span>${update.updateBody}</span>
									</div>
									<div class="update-date">
										<span class="update-day">${update.updateDay}</span>${update.updateMonth}
									</div>
								</c:forEach>
							</c:when>
							<c:otherwise>
								<i class="icon-ok-sign"></i>
								<div class="update-done">
									<a title="" href="#"><strong>No recent News or
											Updates</strong></a>
								</div>
								<div class="update-date">
									<span class="update-date"><fmt:formatDate
											value="${today}" type="date" pattern="dd/MM" /></span>
								</div>
							</c:otherwise>
						</c:choose>
					</div>
				</div>
			</div>

		</div>


		<div class="span6">
			<div class="widget-box widget-chat">
				<div class="widget-title bg_lb">
					<span class="icon"> <i class="icon-comment"></i>
					</span>
					<h5>Message Chat Section</h5>
				</div>
				<div class="widget-content nopadding collapse in" id="collapseG4">
					<div class="chat-users panel-right2">
						<div class="panel-title">
							<h5>Message From</h5>
						</div>
						<div class="panel-content nopadding">
							<c:choose>
								<c:when test="${empty messageList}">
									You have No messages
								</c:when>
								<c:otherwise>
									<ul class="contact-list">
										<li id="user-John" class="online new"><a href=""><img
												alt="" src="${messageList.senderStudent.picture}" /> <span>${messageList.senderStudent.name}
													&nbsp ${messageList.senderStudent.surname}</span></a><span
											class="msg-count badge badge-info">recent</span></li>
									</ul>
								</c:otherwise>
							</c:choose>
						</div>
					</div>
					<div class="chat-content panel-left2">
						<div class="chat-messages" id="chat-messages">
							<div id="chat-messages-inner"></div>
						</div>
						<div class="chat-message well">
							<button class="btn btn-success">Send</button>
							<span class="input-box"> <input type="text" name="msg-box"
								id="msg-box" />
							</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<jsp:include page="/WEB-INF/views/templates/footer/front.jsp" />