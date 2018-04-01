/**
 * Nirmal Singh 2018(nirmalksingh@gmail.com)
 */
'use strict'

var module = angular.module('atcdemo.controllers', []);
module.controller("QueueDequeueController", [ "$scope", "QueueDequeueService",
		function($scope, QueueDequeueService) {
	
			$scope.queueTestPlane = function() {
				QueueDequeueService.queueTestPlane().then(function() {
					console.log("works");
					QueueDequeueService.getDequeueOrder().then(function(value) {
						$scope.allDqPlanes= value.data;
					}, function(reason) {
						console.log("error occured");
					}, function(value) {
						console.log("no callback");
					});
					$scope.allDqPlanes=[];
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}
			
			$scope.resetQueues = function() {
				QueueDequeueService.resetQueues().then(function() {
					console.log("works");
					$scope.allDqPlanes=[];
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}
			
			$scope.queuePlane = function() {
				QueueDequeueService.queuePlane($scope.plane.thePlaneName).then(function() {
					console.log("works");
					QueueDequeueService.getDequeueOrder().then(function(value) {
						$scope.allDqPlanes= value.data;
					}, function(reason) {
						console.log("error occured");
					}, function(value) {
						console.log("no callback");
					});
					
					$scope.allDqPlanes = [];
					
				}, function(reason) {
					console.log("error occured");
				}, function(value) {
					console.log("no callback");
				});
			}
		} ]);