/**
 * Nirmal Singh 2018(nirmalksingh@gmail.com)
 */
'use strict'

angular.module('atcdemo.services', []).factory('QueueDequeueService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.getDequeueOrder = function() {
				return $http.get(CONSTANTS.getDequeueOrder);
			}
			service.queueTestPlane = function() {
				return $http.get(CONSTANTS.queueTestPlane);
			}
			service.queuePlane = function(thePlaneName) {
				var url = CONSTANTS.queuePlane + thePlaneName;
				return $http.get(url);
			}
			service.resetQueues = function() {
				return $http.get(CONSTANTS.resetQueues);
			}
			return service;
		} ]);