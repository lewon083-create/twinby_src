package io.flutter.view;

import android.os.Build;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f25873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f25874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f25875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f25876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f25877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Method f25878f;

    /* JADX WARN: Multi-variable type inference failed */
    public l() throws NoSuchMethodException {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Field field;
        Method method5;
        Method method6 = null;
        try {
            method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", null);
        } catch (NoSuchMethodException unused) {
            Log.w("AccessibilityBridge", "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
            method = null;
        }
        try {
            method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", null);
        } catch (NoSuchMethodException unused2) {
            Log.w("AccessibilityBridge", "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
            method2 = null;
        }
        int i = Build.VERSION.SDK_INT;
        Class cls = Integer.TYPE;
        if (i > 26) {
            try {
                Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                declaredField.setAccessible(true);
                method5 = Class.forName("android.util.LongArray").getMethod("get", cls);
                field = declaredField;
                method4 = null;
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused3) {
                Log.w("AccessibilityBridge", "can't access childNodeIdsField with reflection");
                method4 = null;
                field = null;
                method5 = field;
            }
            this.f25873a = method;
            this.f25874b = method6;
            this.f25875c = method2;
            this.f25876d = method4;
            this.f25877e = field;
            this.f25878f = method5;
        }
        try {
            method3 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", null);
        } catch (NoSuchMethodException unused4) {
            Log.w("AccessibilityBridge", "can't invoke getParentNodeId with reflection");
            method3 = null;
        }
        try {
            method4 = AccessibilityNodeInfo.class.getMethod("getChildId", cls);
            field = null;
        } catch (NoSuchMethodException unused5) {
            Log.w("AccessibilityBridge", "can't invoke getChildId with reflection");
            method4 = null;
            field = null;
        }
        method6 = method3;
        method5 = field;
        this.f25873a = method;
        this.f25874b = method6;
        this.f25875c = method2;
        this.f25876d = method4;
        this.f25877e = field;
        this.f25878f = method5;
    }

    public static Long a(l lVar, AccessibilityRecord accessibilityRecord) {
        Method method = lVar.f25875c;
        if (method != null) {
            try {
                return (Long) method.invoke(accessibilityRecord, null);
            } catch (IllegalAccessException e3) {
                Log.w("AccessibilityBridge", "Failed to access the getRecordSourceNodeId method.", e3);
            } catch (InvocationTargetException e7) {
                Log.w("AccessibilityBridge", "The getRecordSourceNodeId method threw an exception when invoked.", e7);
            }
        }
        return null;
    }

    public static boolean b(int i, long j10) {
        return (j10 & (1 << i)) != 0;
    }
}
