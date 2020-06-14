//////////////////////////////////////////////////////////
// GENERATED BY FLUTTIFY. DO NOT EDIT IT.
//////////////////////////////////////////////////////////

package me.yohom.amap_location_fluttify.sub_handler;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import androidx.annotation.NonNull;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry.Registrar;
import io.flutter.plugin.platform.PlatformViewRegistry;

import me.yohom.amap_location_fluttify.AmapLocationFluttifyPlugin.Handler;

import static me.yohom.foundation_fluttify.FoundationFluttifyPluginKt.getEnableLog;
import static me.yohom.foundation_fluttify.FoundationFluttifyPluginKt.getHEAP;

@SuppressWarnings("ALL")
public class SubHandler3 {
    public static Map<String, Handler> getSubHandler(BinaryMessenger messenger) {
        return new HashMap<String, Handler>() {{
            // factory
            put("ObjectFactory::create_batchcom_amap_api_location_CoordUtil__", (__argsBatch__, __methodResult__) -> {
                List<Integer> __resultList__ = new ArrayList<>();
            
                int __length__ = 0;
                // when batch size is 0, dart side will put a map with key 'length' to indicate the length
                // of this batch
                if (__argsBatch__ instanceof Map) {
                    __length__ = (Integer) ((Map<String, Object>) __argsBatch__).get("length");
                }
                // or directly put the arg batch
                else if (__argsBatch__ instanceof List) {
                    __length__ = ((List<Map<String, Object>>) __argsBatch__).size();
                }
            
                for (int __i__ = 0; __i__ < __length__; __i__++) {
                    Map<String, Object> __args__ = new HashMap<>();
                    // only when arg batch is not empty, java side needs to parse args;
                    if (__argsBatch__ instanceof List) {
                        __args__ = ((List<Map<String, Object>>) __argsBatch__).get(__i__);
                    }
            
                    // args
            
            
                    // create target object
                    com.amap.api.location.CoordUtil __obj__ = new com.amap.api.location.CoordUtil();
                    getHEAP().put(System.identityHashCode(__obj__), __obj__);
            
                    // print current HEAP
                    if (getEnableLog()) {
                        Log.d("ObjectFactory", "HEAP: " + getHEAP());
                    }
            
                    __resultList__.add(System.identityHashCode(__obj__));
                }
            
                __methodResult__.success(__resultList__);
            });
            // factory
            put("ObjectFactory::create_batchcom_amap_api_location_UmidtokenInfo__", (__argsBatch__, __methodResult__) -> {
                List<Integer> __resultList__ = new ArrayList<>();
            
                int __length__ = 0;
                // when batch size is 0, dart side will put a map with key 'length' to indicate the length
                // of this batch
                if (__argsBatch__ instanceof Map) {
                    __length__ = (Integer) ((Map<String, Object>) __argsBatch__).get("length");
                }
                // or directly put the arg batch
                else if (__argsBatch__ instanceof List) {
                    __length__ = ((List<Map<String, Object>>) __argsBatch__).size();
                }
            
                for (int __i__ = 0; __i__ < __length__; __i__++) {
                    Map<String, Object> __args__ = new HashMap<>();
                    // only when arg batch is not empty, java side needs to parse args;
                    if (__argsBatch__ instanceof List) {
                        __args__ = ((List<Map<String, Object>>) __argsBatch__).get(__i__);
                    }
            
                    // args
            
            
                    // create target object
                    com.amap.api.location.UmidtokenInfo __obj__ = new com.amap.api.location.UmidtokenInfo();
                    getHEAP().put(System.identityHashCode(__obj__), __obj__);
            
                    // print current HEAP
                    if (getEnableLog()) {
                        Log.d("ObjectFactory", "HEAP: " + getHEAP());
                    }
            
                    __resultList__.add(System.identityHashCode(__obj__));
                }
            
                __methodResult__.success(__resultList__);
            });
            // factory
            put("ObjectFactory::create_batchcom_amap_api_location_AMapLocation__String", (__argsBatch__, __methodResult__) -> {
                List<Integer> __resultList__ = new ArrayList<>();
            
                int __length__ = 0;
                // when batch size is 0, dart side will put a map with key 'length' to indicate the length
                // of this batch
                if (__argsBatch__ instanceof Map) {
                    __length__ = (Integer) ((Map<String, Object>) __argsBatch__).get("length");
                }
                // or directly put the arg batch
                else if (__argsBatch__ instanceof List) {
                    __length__ = ((List<Map<String, Object>>) __argsBatch__).size();
                }
            
                for (int __i__ = 0; __i__ < __length__; __i__++) {
                    Map<String, Object> __args__ = new HashMap<>();
                    // only when arg batch is not empty, java side needs to parse args;
                    if (__argsBatch__ instanceof List) {
                        __args__ = ((List<Map<String, Object>>) __argsBatch__).get(__i__);
                    }
            
                    // args
                    // jsonable arg
                    String var1 = (String) ((Map<String, Object>) __args__).get("var1");
            
                    // create target object
                    com.amap.api.location.AMapLocation __obj__ = new com.amap.api.location.AMapLocation(var1);
                    getHEAP().put(System.identityHashCode(__obj__), __obj__);
            
                    // print current HEAP
                    if (getEnableLog()) {
                        Log.d("ObjectFactory", "HEAP: " + getHEAP());
                    }
            
                    __resultList__.add(System.identityHashCode(__obj__));
                }
            
                __methodResult__.success(__resultList__);
            });
            // factory
            put("ObjectFactory::create_batchcom_amap_api_location_AMapLocation__android_location_Location", (__argsBatch__, __methodResult__) -> {
                List<Integer> __resultList__ = new ArrayList<>();
            
                int __length__ = 0;
                // when batch size is 0, dart side will put a map with key 'length' to indicate the length
                // of this batch
                if (__argsBatch__ instanceof Map) {
                    __length__ = (Integer) ((Map<String, Object>) __argsBatch__).get("length");
                }
                // or directly put the arg batch
                else if (__argsBatch__ instanceof List) {
                    __length__ = ((List<Map<String, Object>>) __argsBatch__).size();
                }
            
                for (int __i__ = 0; __i__ < __length__; __i__++) {
                    Map<String, Object> __args__ = new HashMap<>();
                    // only when arg batch is not empty, java side needs to parse args;
                    if (__argsBatch__ instanceof List) {
                        __args__ = ((List<Map<String, Object>>) __argsBatch__).get(__i__);
                    }
            
                    // args
                    // ref arg
                    android.location.Location var1 = (android.location.Location) getHEAP().get((int) ((Map<String, Object>) __args__).get("var1"));
            
                    // create target object
                    com.amap.api.location.AMapLocation __obj__ = new com.amap.api.location.AMapLocation(var1);
                    getHEAP().put(System.identityHashCode(__obj__), __obj__);
            
                    // print current HEAP
                    if (getEnableLog()) {
                        Log.d("ObjectFactory", "HEAP: " + getHEAP());
                    }
            
                    __resultList__.add(System.identityHashCode(__obj__));
                }
            
                __methodResult__.success(__resultList__);
            });
            // factory
            put("ObjectFactory::create_batchcom_amap_api_location_AMapLocationClientOption__", (__argsBatch__, __methodResult__) -> {
                List<Integer> __resultList__ = new ArrayList<>();
            
                int __length__ = 0;
                // when batch size is 0, dart side will put a map with key 'length' to indicate the length
                // of this batch
                if (__argsBatch__ instanceof Map) {
                    __length__ = (Integer) ((Map<String, Object>) __argsBatch__).get("length");
                }
                // or directly put the arg batch
                else if (__argsBatch__ instanceof List) {
                    __length__ = ((List<Map<String, Object>>) __argsBatch__).size();
                }
            
                for (int __i__ = 0; __i__ < __length__; __i__++) {
                    Map<String, Object> __args__ = new HashMap<>();
                    // only when arg batch is not empty, java side needs to parse args;
                    if (__argsBatch__ instanceof List) {
                        __args__ = ((List<Map<String, Object>>) __argsBatch__).get(__i__);
                    }
            
                    // args
            
            
                    // create target object
                    com.amap.api.location.AMapLocationClientOption __obj__ = new com.amap.api.location.AMapLocationClientOption();
                    getHEAP().put(System.identityHashCode(__obj__), __obj__);
            
                    // print current HEAP
                    if (getEnableLog()) {
                        Log.d("ObjectFactory", "HEAP: " + getHEAP());
                    }
            
                    __resultList__.add(System.identityHashCode(__obj__));
                }
            
                __methodResult__.success(__resultList__);
            });
            // factory
            put("ObjectFactory::create_batchcom_amap_api_location_AMapLocationQualityReport__", (__argsBatch__, __methodResult__) -> {
                List<Integer> __resultList__ = new ArrayList<>();
            
                int __length__ = 0;
                // when batch size is 0, dart side will put a map with key 'length' to indicate the length
                // of this batch
                if (__argsBatch__ instanceof Map) {
                    __length__ = (Integer) ((Map<String, Object>) __argsBatch__).get("length");
                }
                // or directly put the arg batch
                else if (__argsBatch__ instanceof List) {
                    __length__ = ((List<Map<String, Object>>) __argsBatch__).size();
                }
            
                for (int __i__ = 0; __i__ < __length__; __i__++) {
                    Map<String, Object> __args__ = new HashMap<>();
                    // only when arg batch is not empty, java side needs to parse args;
                    if (__argsBatch__ instanceof List) {
                        __args__ = ((List<Map<String, Object>>) __argsBatch__).get(__i__);
                    }
            
                    // args
            
            
                    // create target object
                    com.amap.api.location.AMapLocationQualityReport __obj__ = new com.amap.api.location.AMapLocationQualityReport();
                    getHEAP().put(System.identityHashCode(__obj__), __obj__);
            
                    // print current HEAP
                    if (getEnableLog()) {
                        Log.d("ObjectFactory", "HEAP: " + getHEAP());
                    }
            
                    __resultList__.add(System.identityHashCode(__obj__));
                }
            
                __methodResult__.success(__resultList__);
            });
            // factory
            put("ObjectFactory::create_batchcom_amap_api_fence_DistrictItem__", (__argsBatch__, __methodResult__) -> {
                List<Integer> __resultList__ = new ArrayList<>();
            
                int __length__ = 0;
                // when batch size is 0, dart side will put a map with key 'length' to indicate the length
                // of this batch
                if (__argsBatch__ instanceof Map) {
                    __length__ = (Integer) ((Map<String, Object>) __argsBatch__).get("length");
                }
                // or directly put the arg batch
                else if (__argsBatch__ instanceof List) {
                    __length__ = ((List<Map<String, Object>>) __argsBatch__).size();
                }
            
                for (int __i__ = 0; __i__ < __length__; __i__++) {
                    Map<String, Object> __args__ = new HashMap<>();
                    // only when arg batch is not empty, java side needs to parse args;
                    if (__argsBatch__ instanceof List) {
                        __args__ = ((List<Map<String, Object>>) __argsBatch__).get(__i__);
                    }
            
                    // args
            
            
                    // create target object
                    com.amap.api.fence.DistrictItem __obj__ = new com.amap.api.fence.DistrictItem();
                    getHEAP().put(System.identityHashCode(__obj__), __obj__);
            
                    // print current HEAP
                    if (getEnableLog()) {
                        Log.d("ObjectFactory", "HEAP: " + getHEAP());
                    }
            
                    __resultList__.add(System.identityHashCode(__obj__));
                }
            
                __methodResult__.success(__resultList__);
            });
            // factory
            put("ObjectFactory::create_batchcom_amap_api_fence_GeoFenceClient__android_content_Context", (__argsBatch__, __methodResult__) -> {
                List<Integer> __resultList__ = new ArrayList<>();
            
                int __length__ = 0;
                // when batch size is 0, dart side will put a map with key 'length' to indicate the length
                // of this batch
                if (__argsBatch__ instanceof Map) {
                    __length__ = (Integer) ((Map<String, Object>) __argsBatch__).get("length");
                }
                // or directly put the arg batch
                else if (__argsBatch__ instanceof List) {
                    __length__ = ((List<Map<String, Object>>) __argsBatch__).size();
                }
            
                for (int __i__ = 0; __i__ < __length__; __i__++) {
                    Map<String, Object> __args__ = new HashMap<>();
                    // only when arg batch is not empty, java side needs to parse args;
                    if (__argsBatch__ instanceof List) {
                        __args__ = ((List<Map<String, Object>>) __argsBatch__).get(__i__);
                    }
            
                    // args
                    // ref arg
                    android.content.Context var1 = (android.content.Context) getHEAP().get((int) ((Map<String, Object>) __args__).get("var1"));
            
                    // create target object
                    com.amap.api.fence.GeoFenceClient __obj__ = new com.amap.api.fence.GeoFenceClient(var1);
                    getHEAP().put(System.identityHashCode(__obj__), __obj__);
            
                    // print current HEAP
                    if (getEnableLog()) {
                        Log.d("ObjectFactory", "HEAP: " + getHEAP());
                    }
            
                    __resultList__.add(System.identityHashCode(__obj__));
                }
            
                __methodResult__.success(__resultList__);
            });
            // factory
            put("ObjectFactory::create_batchcom_amap_api_fence_GeoFence__", (__argsBatch__, __methodResult__) -> {
                List<Integer> __resultList__ = new ArrayList<>();
            
                int __length__ = 0;
                // when batch size is 0, dart side will put a map with key 'length' to indicate the length
                // of this batch
                if (__argsBatch__ instanceof Map) {
                    __length__ = (Integer) ((Map<String, Object>) __argsBatch__).get("length");
                }
                // or directly put the arg batch
                else if (__argsBatch__ instanceof List) {
                    __length__ = ((List<Map<String, Object>>) __argsBatch__).size();
                }
            
                for (int __i__ = 0; __i__ < __length__; __i__++) {
                    Map<String, Object> __args__ = new HashMap<>();
                    // only when arg batch is not empty, java side needs to parse args;
                    if (__argsBatch__ instanceof List) {
                        __args__ = ((List<Map<String, Object>>) __argsBatch__).get(__i__);
                    }
            
                    // args
            
            
                    // create target object
                    com.amap.api.fence.GeoFence __obj__ = new com.amap.api.fence.GeoFence();
                    getHEAP().put(System.identityHashCode(__obj__), __obj__);
            
                    // print current HEAP
                    if (getEnableLog()) {
                        Log.d("ObjectFactory", "HEAP: " + getHEAP());
                    }
            
                    __resultList__.add(System.identityHashCode(__obj__));
                }
            
                __methodResult__.success(__resultList__);
            });
            // factory
            put("ObjectFactory::create_batchcom_amap_api_fence_PoiItem__", (__argsBatch__, __methodResult__) -> {
                List<Integer> __resultList__ = new ArrayList<>();
            
                int __length__ = 0;
                // when batch size is 0, dart side will put a map with key 'length' to indicate the length
                // of this batch
                if (__argsBatch__ instanceof Map) {
                    __length__ = (Integer) ((Map<String, Object>) __argsBatch__).get("length");
                }
                // or directly put the arg batch
                else if (__argsBatch__ instanceof List) {
                    __length__ = ((List<Map<String, Object>>) __argsBatch__).size();
                }
            
                for (int __i__ = 0; __i__ < __length__; __i__++) {
                    Map<String, Object> __args__ = new HashMap<>();
                    // only when arg batch is not empty, java side needs to parse args;
                    if (__argsBatch__ instanceof List) {
                        __args__ = ((List<Map<String, Object>>) __argsBatch__).get(__i__);
                    }
            
                    // args
            
            
                    // create target object
                    com.amap.api.fence.PoiItem __obj__ = new com.amap.api.fence.PoiItem();
                    getHEAP().put(System.identityHashCode(__obj__), __obj__);
            
                    // print current HEAP
                    if (getEnableLog()) {
                        Log.d("ObjectFactory", "HEAP: " + getHEAP());
                    }
            
                    __resultList__.add(System.identityHashCode(__obj__));
                }
            
                __methodResult__.success(__resultList__);
            });
        }};
    }
}
