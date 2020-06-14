// ignore_for_file: non_constant_identifier_names, camel_case_types, missing_return, unused_import, unused_local_variable, dead_code, unnecessary_cast
//////////////////////////////////////////////////////////
// GENERATED BY FLUTTIFY. DO NOT EDIT IT.
//////////////////////////////////////////////////////////

import 'dart:typed_data';

import 'package:amap_location_fluttify/src/ios/ios.export.g.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/services.dart';

import 'package:foundation_fluttify/foundation_fluttify.dart';
import 'package:core_location_fluttify/core_location_fluttify.dart';

class AMapLocationPolygonRegion extends AMapLocationRegion with NSCopying {
  //region constants
  static const String name__ = 'AMapLocationPolygonRegion';

  
  //endregion

  //region creators
  static Future<AMapLocationPolygonRegion> create__() async {
    final int refId = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('ObjectFactory::createAMapLocationPolygonRegion');
    final object = AMapLocationPolygonRegion()..refId = refId..tag__ = 'amap_location_fluttify';
  
    kNativeObjectPool.add(object);
    return object;
  }
  
  static Future<List<AMapLocationPolygonRegion>> create_batch__(int length) async {
    if (false) {
      return Future.error('all args must have same length!');
    }
    final List resultBatch = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('ObjectFactory::create_batchAMapLocationPolygonRegion', {'length': length});
  
    final List<AMapLocationPolygonRegion> typedResult = resultBatch.map((result) => AMapLocationPolygonRegion()..refId = result..tag__ = 'amap_location_fluttify').toList();
    kNativeObjectPool.addAll(typedResult);
    return typedResult;
  }
  
  //endregion

  //region getters
  Future<List<CLLocationCoordinate2D>> get_coordinates() async {
    final __result__ = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod("AMapLocationPolygonRegion::get_coordinates", {'refId': refId});
    kNativeObjectPool.addAll((__result__ as List).cast<int>().map((__it__) => CLLocationCoordinate2D()..refId = __it__..tag__ = 'amap_location_fluttify').toList());
    return (__result__ as List).cast<int>().map((__it__) => CLLocationCoordinate2D()..refId = __it__..tag__ = 'amap_location_fluttify').toList();
  }
  
  Future<int> get_count() async {
    final __result__ = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod("AMapLocationPolygonRegion::get_count", {'refId': refId});
  
    return __result__;
  }
  
  //endregion

  //region setters
  
  //endregion

  //region methods
  
  Future<AMapLocationPolygonRegion> initWithCoordinates_count_identifier(List<CLLocationCoordinate2D> coordinates, int count, String identifier) async {
    // print log
    if (fluttifyLogEnabled) {
      debugPrint('fluttify-dart: AMapLocationPolygonRegion@$refId::initWithCoordinates([\'count\':$count, \'identifier\':$identifier])');
    }
  
    // invoke native method
    final __result__ = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('AMapLocationPolygonRegion::initWithCoordinates_count_identifier', {"coordinates": coordinates.map((__it__) => __it__.refId).toList(), "count": count, "identifier": identifier, "refId": refId});
  
  
    // handle native call
  
  
    // convert native result to dart side object
    if (__result__ == null) {
      return null;
    } else {
      final __return__ = AMapLocationPolygonRegion()..refId = __result__..tag__ = 'amap_location_fluttify';
      if (__result__ is Ref) kNativeObjectPool.add(__return__ as Ref);
      return __return__;
    }
  }
  
  //endregion
}

extension AMapLocationPolygonRegion_Batch on List<AMapLocationPolygonRegion> {
  //region getters
  Future<List<List<CLLocationCoordinate2D>>> get_coordinates_batch() async {
    final resultBatch = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod("AMapLocationPolygonRegion::get_coordinates_batch", [for (final __item__ in this) {'refId': __item__.refId}]);
    final typedResult = (resultBatch as List).cast<int>().map((__result__) => (__result__ as List).cast<int>().map((__it__) => CLLocationCoordinate2D()..refId = __it__..tag__ = 'amap_location_fluttify').toList()).toList();
    kNativeObjectPool.addAll(typedResult.expand((e) => e));
    return typedResult;
  }
  
  Future<List<int>> get_count_batch() async {
    final resultBatch = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod("AMapLocationPolygonRegion::get_count_batch", [for (final __item__ in this) {'refId': __item__.refId}]);
    final typedResult = (resultBatch as List).cast<int>().map((__result__) => __result__).toList();
  
    return typedResult;
  }
  
  //endregion

  //region setters
  
  //endregion

  //region methods
  
  Future<List<AMapLocationPolygonRegion>> initWithCoordinates_count_identifier_batch(List<List<CLLocationCoordinate2D>> coordinates, List<int> count, List<String> identifier) async {
    if (coordinates.length != count.length || count.length != identifier.length) {
      return Future.error('all args must have same length!');
    }
  
    // invoke native method
    final resultBatch = await MethodChannel('me.yohom/amap_location_fluttify').invokeMethod('AMapLocationPolygonRegion::initWithCoordinates_count_identifier_batch', [for (int __i__ = 0; __i__ < this.length; __i__++) {"coordinates": coordinates[__i__].map((it) => it.refId).toList(), "count": count[__i__], "identifier": identifier[__i__], "refId": this[__i__].refId}]);
  
  
    // convert native result to dart side object
    if (resultBatch == null) {
      return null;
    } else {
      final typedResult = (resultBatch as List).cast<int>().map((__result__) => AMapLocationPolygonRegion()..refId = __result__..tag__ = 'amap_location_fluttify').toList();
      kNativeObjectPool.addAll(typedResult);
      return typedResult;
    }
  }
  
  //endregion
}