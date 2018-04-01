/**
 * Nirmal Singh 2018(nirmalksingh@gmail.com)
 */
'use strict'

var demoApp = angular.module('atcdemo', [ 'ui.bootstrap', 'atcdemo.controllers',
		'atcdemo.services' ]);
demoApp.constant("CONSTANTS", {
	getDequeueOrder : "/plane/getDequeueOrder",
	queueTestPlane : "/plane/queueTestPlane",
	queuePlane : "/plane/queuePlane/",
	resetQueues : "/plane/resetQueues"
});