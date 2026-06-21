package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.window.BackEvent;
import com.google.android.gms.internal.ads.ix;
import com.google.android.gms.internal.ads.oc;
import com.google.android.gms.internal.ads.yl;
import com.google.android.gms.internal.ads.zw;
import com.twinby.R;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13772a = 14;

    public static void A(ii.f binaryMessenger, final fj.q qVar) {
        a1.m mVar;
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m nVar = (qVar == null || (mVar = qVar.f19403a) == null) ? new cj.n(1) : mVar.m();
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor", nVar, obj);
        if (qVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: fj.h0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    switch (i) {
                        case 0:
                            q qVar2 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) qVar2.f19403a.f363c).a(((Long) obj3).longValue(), new u0(qVar2));
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof a) {
                                    a aVar = exception;
                                    listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            q qVar3 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var = (u0) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                qVar3.getClass();
                                u0Var.f19428c = zBooleanValue;
                                listF2 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof a) {
                                    a aVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            q qVar4 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var2 = (u0) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                qVar4.getClass();
                                u0Var2.f19429d = zBooleanValue2;
                                listF3 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof a) {
                                    a aVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(aVar3.f19299b, aVar3.f19300c, aVar3.f19301d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            q qVar5 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var3 = (u0) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                qVar5.getClass();
                                u0Var3.f19430e = zBooleanValue3;
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            q qVar6 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var4 = (u0) obj10;
                            Object obj11 = list4.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                qVar6.getClass();
                                u0Var4.f19431f = zBooleanValue4;
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        default:
                            q qVar7 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var5 = (u0) obj12;
                            Object obj13 = list5.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                qVar7.getClass();
                                u0Var5.f19432g = zBooleanValue5;
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser", nVar, obj);
        if (qVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: fj.h0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    switch (i10) {
                        case 0:
                            q qVar2 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) qVar2.f19403a.f363c).a(((Long) obj3).longValue(), new u0(qVar2));
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof a) {
                                    a aVar = exception;
                                    listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            q qVar3 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var = (u0) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                qVar3.getClass();
                                u0Var.f19428c = zBooleanValue;
                                listF2 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof a) {
                                    a aVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            q qVar4 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var2 = (u0) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                qVar4.getClass();
                                u0Var2.f19429d = zBooleanValue2;
                                listF3 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof a) {
                                    a aVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(aVar3.f19299b, aVar3.f19300c, aVar3.f19301d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            q qVar5 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var3 = (u0) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                qVar5.getClass();
                                u0Var3.f19430e = zBooleanValue3;
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            q qVar6 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var4 = (u0) obj10;
                            Object obj11 = list4.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                qVar6.getClass();
                                u0Var4.f19431f = zBooleanValue4;
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        default:
                            q qVar7 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var5 = (u0) obj12;
                            Object obj13 = list5.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                qVar7.getClass();
                                u0Var5.f19432g = zBooleanValue5;
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage", nVar, obj);
        if (qVar != null) {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: fj.h0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    switch (i11) {
                        case 0:
                            q qVar2 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) qVar2.f19403a.f363c).a(((Long) obj3).longValue(), new u0(qVar2));
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof a) {
                                    a aVar = exception;
                                    listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            q qVar3 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var = (u0) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                qVar3.getClass();
                                u0Var.f19428c = zBooleanValue;
                                listF2 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof a) {
                                    a aVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            q qVar4 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var2 = (u0) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                qVar4.getClass();
                                u0Var2.f19429d = zBooleanValue2;
                                listF3 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof a) {
                                    a aVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(aVar3.f19299b, aVar3.f19300c, aVar3.f19301d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            q qVar5 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var3 = (u0) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                qVar5.getClass();
                                u0Var3.f19430e = zBooleanValue3;
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            q qVar6 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var4 = (u0) obj10;
                            Object obj11 = list4.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                qVar6.getClass();
                                u0Var4.f19431f = zBooleanValue4;
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        default:
                            q qVar7 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var5 = (u0) obj12;
                            Object obj13 = list5.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                qVar7.getClass();
                                u0Var5.f19432g = zBooleanValue5;
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert", nVar, obj);
        if (qVar != null) {
            final int i12 = 3;
            gVar4.L(new ii.b() { // from class: fj.h0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    switch (i12) {
                        case 0:
                            q qVar2 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) qVar2.f19403a.f363c).a(((Long) obj3).longValue(), new u0(qVar2));
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof a) {
                                    a aVar = exception;
                                    listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            q qVar3 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var = (u0) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                qVar3.getClass();
                                u0Var.f19428c = zBooleanValue;
                                listF2 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof a) {
                                    a aVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            q qVar4 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var2 = (u0) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                qVar4.getClass();
                                u0Var2.f19429d = zBooleanValue2;
                                listF3 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof a) {
                                    a aVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(aVar3.f19299b, aVar3.f19300c, aVar3.f19301d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            q qVar5 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var3 = (u0) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                qVar5.getClass();
                                u0Var3.f19430e = zBooleanValue3;
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            q qVar6 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var4 = (u0) obj10;
                            Object obj11 = list4.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                qVar6.getClass();
                                u0Var4.f19431f = zBooleanValue4;
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        default:
                            q qVar7 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var5 = (u0) obj12;
                            Object obj13 = list5.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                qVar7.getClass();
                                u0Var5.f19432g = zBooleanValue5;
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                    }
                }
            });
        } else {
            gVar4.L(null);
        }
        s7.g gVar5 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm", nVar, obj);
        if (qVar != null) {
            final int i13 = 4;
            gVar5.L(new ii.b() { // from class: fj.h0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    switch (i13) {
                        case 0:
                            q qVar2 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) qVar2.f19403a.f363c).a(((Long) obj3).longValue(), new u0(qVar2));
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof a) {
                                    a aVar = exception;
                                    listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            q qVar3 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var = (u0) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                qVar3.getClass();
                                u0Var.f19428c = zBooleanValue;
                                listF2 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof a) {
                                    a aVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            q qVar4 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var2 = (u0) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                qVar4.getClass();
                                u0Var2.f19429d = zBooleanValue2;
                                listF3 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof a) {
                                    a aVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(aVar3.f19299b, aVar3.f19300c, aVar3.f19301d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            q qVar5 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var3 = (u0) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                qVar5.getClass();
                                u0Var3.f19430e = zBooleanValue3;
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            q qVar6 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var4 = (u0) obj10;
                            Object obj11 = list4.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                qVar6.getClass();
                                u0Var4.f19431f = zBooleanValue4;
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        default:
                            q qVar7 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var5 = (u0) obj12;
                            Object obj13 = list5.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                qVar7.getClass();
                                u0Var5.f19432g = zBooleanValue5;
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                    }
                }
            });
        } else {
            gVar5.L(null);
        }
        s7.g gVar6 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt", nVar, obj);
        if (qVar == null) {
            gVar6.L(null);
        } else {
            final int i14 = 5;
            gVar6.L(new ii.b() { // from class: fj.h0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    List listF6;
                    switch (i14) {
                        case 0:
                            q qVar2 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((c) qVar2.f19403a.f363c).a(((Long) obj3).longValue(), new u0(qVar2));
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof a) {
                                    a aVar = exception;
                                    listF = kotlin.collections.s.f(aVar.f19299b, aVar.f19300c, aVar.f19301d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            q qVar3 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var = (u0) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                qVar3.getClass();
                                u0Var.f19428c = zBooleanValue;
                                listF2 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof a) {
                                    a aVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(aVar2.f19299b, aVar2.f19300c, aVar2.f19301d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            q qVar4 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var2 = (u0) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            try {
                                qVar4.getClass();
                                u0Var2.f19429d = zBooleanValue2;
                                listF3 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof a) {
                                    a aVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(aVar3.f19299b, aVar3.f19300c, aVar3.f19301d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            q qVar5 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj8 = list3.get(0);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var3 = (u0) obj8;
                            Object obj9 = list3.get(1);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue3 = ((Boolean) obj9).booleanValue();
                            try {
                                qVar5.getClass();
                                u0Var3.f19430e = zBooleanValue3;
                                listF4 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof a) {
                                    a aVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(aVar4.f19299b, aVar4.f19300c, aVar4.f19301d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        case 4:
                            q qVar6 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj2;
                            Object obj10 = list4.get(0);
                            Intrinsics.c(obj10, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var4 = (u0) obj10;
                            Object obj11 = list4.get(1);
                            Intrinsics.c(obj11, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue4 = ((Boolean) obj11).booleanValue();
                            try {
                                qVar6.getClass();
                                u0Var4.f19431f = zBooleanValue4;
                                listF5 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof a) {
                                    a aVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(aVar5.f19299b, aVar5.f19300c, aVar5.f19301d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                        default:
                            q qVar7 = qVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj2;
                            Object obj12 = list5.get(0);
                            Intrinsics.c(obj12, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            u0 u0Var5 = (u0) obj12;
                            Object obj13 = list5.get(1);
                            Intrinsics.c(obj13, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue5 = ((Boolean) obj13).booleanValue();
                            try {
                                qVar7.getClass();
                                u0Var5.f19432g = zBooleanValue5;
                                listF6 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception6) {
                                Intrinsics.checkNotNullParameter(exception6, "exception");
                                if (exception6 instanceof a) {
                                    a aVar6 = exception6;
                                    listF6 = kotlin.collections.s.f(aVar6.f19299b, aVar6.f19300c, aVar6.f19301d);
                                } else {
                                    listF6 = kotlin.collections.s.f(exception6.getClass().getSimpleName(), exception6.toString(), l7.o.k("Cause: ", exception6.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception6)));
                                }
                            }
                            reply.i(listF6);
                            break;
                    }
                }
            });
        }
    }

    public static void B(ii.f binaryMessenger, final ni.c cVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA = cVar != null ? cVar.f29359a.a() : new cj.n(2);
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.DeviceOrientationManager.pigeon_defaultConstructor", mVarA, obj);
        if (cVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: ni.p0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    switch (i) {
                        case 0:
                            c cVar2 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) cVar2.f29359a.f6853d).a(((Long) obj3).longValue(), new z(cVar2));
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            c cVar3 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar = (z) obj4;
                            try {
                                cVar3.getClass();
                                x xVar = zVar.f29509c;
                                if (xVar != null) {
                                    zVar.f29508b = 0;
                                    xVar.disable();
                                    zVar.f29509c = null;
                                }
                                x xVar2 = new x(zVar, (Context) zVar.f29507a.f29359a.f6857h);
                                zVar.f29509c = xVar2;
                                xVar2.enable();
                                listF2 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            c cVar4 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar2 = (z) obj5;
                            try {
                                cVar4.getClass();
                                x xVar3 = zVar2.f29509c;
                                if (xVar3 != null) {
                                    zVar2.f29508b = 0;
                                    xVar3.disable();
                                    zVar2.f29509c = null;
                                }
                                listF3 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            c cVar5 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            int rotation = 0;
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar3 = (z) obj6;
                            try {
                                cVar5.getClass();
                                Display displayB = zVar3.f29507a.f29359a.b();
                                if (displayB == null) {
                                    Log.w("DeviceOrientationManager", "Cannot get display: Activity may be null (destroyed or not yet attached) due to a race condition.");
                                } else {
                                    rotation = displayB.getRotation();
                                }
                                listF4 = kotlin.collections.r.c(Long.valueOf(rotation));
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        default:
                            c cVar6 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar4 = (z) obj7;
                            try {
                                cVar6.getClass();
                                listF5 = kotlin.collections.r.c(gf.a.w(zVar4.a()));
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.DeviceOrientationManager.startListeningForDeviceOrientationChange", mVarA, obj);
        if (cVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: ni.p0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    switch (i10) {
                        case 0:
                            c cVar2 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) cVar2.f29359a.f6853d).a(((Long) obj3).longValue(), new z(cVar2));
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            c cVar3 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar = (z) obj4;
                            try {
                                cVar3.getClass();
                                x xVar = zVar.f29509c;
                                if (xVar != null) {
                                    zVar.f29508b = 0;
                                    xVar.disable();
                                    zVar.f29509c = null;
                                }
                                x xVar2 = new x(zVar, (Context) zVar.f29507a.f29359a.f6857h);
                                zVar.f29509c = xVar2;
                                xVar2.enable();
                                listF2 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            c cVar4 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar2 = (z) obj5;
                            try {
                                cVar4.getClass();
                                x xVar3 = zVar2.f29509c;
                                if (xVar3 != null) {
                                    zVar2.f29508b = 0;
                                    xVar3.disable();
                                    zVar2.f29509c = null;
                                }
                                listF3 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            c cVar5 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            int rotation = 0;
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar3 = (z) obj6;
                            try {
                                cVar5.getClass();
                                Display displayB = zVar3.f29507a.f29359a.b();
                                if (displayB == null) {
                                    Log.w("DeviceOrientationManager", "Cannot get display: Activity may be null (destroyed or not yet attached) due to a race condition.");
                                } else {
                                    rotation = displayB.getRotation();
                                }
                                listF4 = kotlin.collections.r.c(Long.valueOf(rotation));
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        default:
                            c cVar6 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar4 = (z) obj7;
                            try {
                                cVar6.getClass();
                                listF5 = kotlin.collections.r.c(gf.a.w(zVar4.a()));
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.DeviceOrientationManager.stopListeningForDeviceOrientationChange", mVarA, obj);
        if (cVar != null) {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: ni.p0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    switch (i11) {
                        case 0:
                            c cVar2 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) cVar2.f29359a.f6853d).a(((Long) obj3).longValue(), new z(cVar2));
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            c cVar3 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar = (z) obj4;
                            try {
                                cVar3.getClass();
                                x xVar = zVar.f29509c;
                                if (xVar != null) {
                                    zVar.f29508b = 0;
                                    xVar.disable();
                                    zVar.f29509c = null;
                                }
                                x xVar2 = new x(zVar, (Context) zVar.f29507a.f29359a.f6857h);
                                zVar.f29509c = xVar2;
                                xVar2.enable();
                                listF2 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            c cVar4 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar2 = (z) obj5;
                            try {
                                cVar4.getClass();
                                x xVar3 = zVar2.f29509c;
                                if (xVar3 != null) {
                                    zVar2.f29508b = 0;
                                    xVar3.disable();
                                    zVar2.f29509c = null;
                                }
                                listF3 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            c cVar5 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            int rotation = 0;
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar3 = (z) obj6;
                            try {
                                cVar5.getClass();
                                Display displayB = zVar3.f29507a.f29359a.b();
                                if (displayB == null) {
                                    Log.w("DeviceOrientationManager", "Cannot get display: Activity may be null (destroyed or not yet attached) due to a race condition.");
                                } else {
                                    rotation = displayB.getRotation();
                                }
                                listF4 = kotlin.collections.r.c(Long.valueOf(rotation));
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        default:
                            c cVar6 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar4 = (z) obj7;
                            try {
                                cVar6.getClass();
                                listF5 = kotlin.collections.r.c(gf.a.w(zVar4.a()));
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.DeviceOrientationManager.getDefaultDisplayRotation", mVarA, obj);
        if (cVar != null) {
            final int i12 = 3;
            gVar4.L(new ii.b() { // from class: ni.p0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    switch (i12) {
                        case 0:
                            c cVar2 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) cVar2.f29359a.f6853d).a(((Long) obj3).longValue(), new z(cVar2));
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            c cVar3 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar = (z) obj4;
                            try {
                                cVar3.getClass();
                                x xVar = zVar.f29509c;
                                if (xVar != null) {
                                    zVar.f29508b = 0;
                                    xVar.disable();
                                    zVar.f29509c = null;
                                }
                                x xVar2 = new x(zVar, (Context) zVar.f29507a.f29359a.f6857h);
                                zVar.f29509c = xVar2;
                                xVar2.enable();
                                listF2 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            c cVar4 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar2 = (z) obj5;
                            try {
                                cVar4.getClass();
                                x xVar3 = zVar2.f29509c;
                                if (xVar3 != null) {
                                    zVar2.f29508b = 0;
                                    xVar3.disable();
                                    zVar2.f29509c = null;
                                }
                                listF3 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            c cVar5 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            int rotation = 0;
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar3 = (z) obj6;
                            try {
                                cVar5.getClass();
                                Display displayB = zVar3.f29507a.f29359a.b();
                                if (displayB == null) {
                                    Log.w("DeviceOrientationManager", "Cannot get display: Activity may be null (destroyed or not yet attached) due to a race condition.");
                                } else {
                                    rotation = displayB.getRotation();
                                }
                                listF4 = kotlin.collections.r.c(Long.valueOf(rotation));
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        default:
                            c cVar6 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar4 = (z) obj7;
                            try {
                                cVar6.getClass();
                                listF5 = kotlin.collections.r.c(gf.a.w(zVar4.a()));
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                    }
                }
            });
        } else {
            gVar4.L(null);
        }
        s7.g gVar5 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.DeviceOrientationManager.getUiOrientation", mVarA, obj);
        if (cVar == null) {
            gVar5.L(null);
        } else {
            final int i13 = 4;
            gVar5.L(new ii.b() { // from class: ni.p0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    switch (i13) {
                        case 0:
                            c cVar2 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) cVar2.f29359a.f6853d).a(((Long) obj3).longValue(), new z(cVar2));
                                listF = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof p) {
                                    p pVar = exception;
                                    listF = kotlin.collections.s.f(pVar.f29468b, pVar.f29469c, pVar.f29470d);
                                } else {
                                    listF = kotlin.collections.s.f(exception.getClass().getSimpleName(), exception.toString(), l7.o.k("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.i(listF);
                            break;
                        case 1:
                            c cVar3 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar = (z) obj4;
                            try {
                                cVar3.getClass();
                                x xVar = zVar.f29509c;
                                if (xVar != null) {
                                    zVar.f29508b = 0;
                                    xVar.disable();
                                    zVar.f29509c = null;
                                }
                                x xVar2 = new x(zVar, (Context) zVar.f29507a.f29359a.f6857h);
                                zVar.f29509c = xVar2;
                                xVar2.enable();
                                listF2 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof p) {
                                    p pVar2 = exception2;
                                    listF2 = kotlin.collections.s.f(pVar2.f29468b, pVar2.f29469c, pVar2.f29470d);
                                } else {
                                    listF2 = kotlin.collections.s.f(exception2.getClass().getSimpleName(), exception2.toString(), l7.o.k("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            reply.i(listF2);
                            break;
                        case 2:
                            c cVar4 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar2 = (z) obj5;
                            try {
                                cVar4.getClass();
                                x xVar3 = zVar2.f29509c;
                                if (xVar3 != null) {
                                    zVar2.f29508b = 0;
                                    xVar3.disable();
                                    zVar2.f29509c = null;
                                }
                                listF3 = kotlin.collections.r.c(null);
                                break;
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof p) {
                                    p pVar3 = exception3;
                                    listF3 = kotlin.collections.s.f(pVar3.f29468b, pVar3.f29469c, pVar3.f29470d);
                                } else {
                                    listF3 = kotlin.collections.s.f(exception3.getClass().getSimpleName(), exception3.toString(), l7.o.k("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.i(listF3);
                            break;
                        case 3:
                            c cVar5 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            int rotation = 0;
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar3 = (z) obj6;
                            try {
                                cVar5.getClass();
                                Display displayB = zVar3.f29507a.f29359a.b();
                                if (displayB == null) {
                                    Log.w("DeviceOrientationManager", "Cannot get display: Activity may be null (destroyed or not yet attached) due to a race condition.");
                                } else {
                                    rotation = displayB.getRotation();
                                }
                                listF4 = kotlin.collections.r.c(Long.valueOf(rotation));
                                break;
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof p) {
                                    p pVar4 = exception4;
                                    listF4 = kotlin.collections.s.f(pVar4.f29468b, pVar4.f29469c, pVar4.f29470d);
                                } else {
                                    listF4 = kotlin.collections.s.f(exception4.getClass().getSimpleName(), exception4.toString(), l7.o.k("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.i(listF4);
                            break;
                        default:
                            c cVar6 = cVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.camerax.DeviceOrientationManager");
                            z zVar4 = (z) obj7;
                            try {
                                cVar6.getClass();
                                listF5 = kotlin.collections.r.c(gf.a.w(zVar4.a()));
                                break;
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof p) {
                                    p pVar5 = exception5;
                                    listF5 = kotlin.collections.s.f(pVar5.f29468b, pVar5.f29469c, pVar5.f29470d);
                                } else {
                                    listF5 = kotlin.collections.s.f(exception5.getClass().getSimpleName(), exception5.toString(), l7.o.k("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.i(listF5);
                            break;
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean C(q4.h r12, boolean r13) {
        /*
            m3.p r0 = new m3.p
            r1 = 16
            r0.<init>(r1)
            r2 = 1
            r3 = r2
        L9:
            r4 = 8
            r0.J(r4)
            byte[] r5 = r0.f28589a
            r6 = 0
            boolean r5 = r12.y(r5, r6, r4, r2)
            if (r5 != 0) goto L18
            goto L65
        L18:
            long r7 = r0.B()
            int r5 = r0.m()
            r9 = 1
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 != 0) goto L35
            byte[] r7 = r0.f28589a
            boolean r7 = r12.y(r7, r4, r4, r2)
            if (r7 != 0) goto L2f
            goto L65
        L2f:
            long r7 = r0.F()
            r9 = r1
            goto L36
        L35:
            r9 = r4
        L36:
            long r9 = (long) r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L3c
            goto L65
        L3c:
            long r7 = r7 - r9
            int r7 = (int) r7
            if (r3 == 0) goto L66
            r3 = 1718909296(0x66747970, float:2.8862439E23)
            if (r5 != r3) goto L65
            if (r7 >= r4) goto L48
            goto L65
        L48:
            r3 = 4
            r0.J(r3)
            byte[] r4 = r0.f28589a
            r12.y(r4, r6, r3, r6)
            int r3 = r0.m()
            r4 = 1751476579(0x68656963, float:4.333464E24)
            if (r3 == r4) goto L5b
            goto L65
        L5b:
            if (r13 != 0) goto L5e
            goto L6b
        L5e:
            int r7 = r7 + (-4)
            r12.a(r7, r6)
            r3 = r6
            goto L9
        L65:
            return r6
        L66:
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r5 != r4) goto L6c
        L6b:
            return r2
        L6c:
            if (r7 == 0) goto L9
            r12.a(r7, r6)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.h5.C(q4.h, boolean):boolean");
    }

    public static final Object D(mk.q qVar, mk.q qVar2, Function2 function2) throws Throwable {
        Object tVar;
        Object objI;
        try {
            kotlin.jvm.internal.k0.b(2, function2);
            tVar = function2.invoke(qVar2, qVar);
        } catch (Throwable th2) {
            tVar = new hk.t(th2, false);
        }
        nj.a aVar = nj.a.f29512b;
        if (tVar == aVar || (objI = qVar.I(tVar)) == hk.c0.f20645e) {
            return aVar;
        }
        if (objI instanceof hk.t) {
            throw ((hk.t) objI).f20711a;
        }
        return hk.c0.s(objI);
    }

    public static final void E(Object obj) throws Throwable {
        if (obj instanceof ij.l) {
            throw ((ij.l) obj).f21340b;
        }
    }

    public static HashMap F(Location location) {
        if (location == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("latitude", Double.valueOf(location.getLatitude()));
        map.put("longitude", Double.valueOf(location.getLongitude()));
        map.put("timestamp", Long.valueOf(location.getTime()));
        int i = Build.VERSION.SDK_INT;
        map.put("is_mocked", Boolean.valueOf(i >= 31 ? location.isMock() : location.isFromMockProvider()));
        if (location.hasAltitude()) {
            map.put("altitude", Double.valueOf(location.getAltitude()));
        }
        if (i >= 26 && location.hasVerticalAccuracy()) {
            map.put("altitude_accuracy", Float.valueOf(location.getVerticalAccuracyMeters()));
        }
        if (location.hasAccuracy()) {
            map.put("accuracy", Double.valueOf(location.getAccuracy()));
        }
        if (location.hasBearing()) {
            map.put("heading", Double.valueOf(location.getBearing()));
        }
        if (i >= 26 && location.hasBearingAccuracy()) {
            map.put("heading_accuracy", Float.valueOf(location.getBearingAccuracyDegrees()));
        }
        if (location.hasSpeed()) {
            map.put("speed", Double.valueOf(location.getSpeed()));
        }
        if (i >= 26 && location.hasSpeedAccuracy()) {
            map.put("speed_accuracy", Double.valueOf(location.getSpeedAccuracyMetersPerSecond()));
        }
        if (location.getExtras() != null) {
            if (location.getExtras().containsKey("geolocator_mslAltitude")) {
                map.put("altitude", Double.valueOf(location.getExtras().getDouble("geolocator_mslAltitude")));
            }
            if (location.getExtras().containsKey("geolocator_mslSatelliteCount")) {
                map.put("gnss_satellite_count", Double.valueOf(location.getExtras().getDouble("geolocator_mslSatelliteCount")));
            }
            if (location.getExtras().containsKey("geolocator_mslSatellitesUsedInFix")) {
                map.put("gnss_satellites_used_in_fix", Double.valueOf(location.getExtras().getDouble("geolocator_mslSatellitesUsedInFix")));
            }
            if (i >= 34 && location.hasMslAltitude()) {
                map.put("altitude", Double.valueOf(location.getMslAltitudeMeters()));
                if (location.hasMslAltitudeAccuracy()) {
                    map.put("altitude_accuracy", Float.valueOf(location.getMslAltitudeAccuracyMeters()));
                }
            }
        }
        return map;
    }

    public static ArrayList G(Throwable th2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th2.toString());
        arrayList.add(th2.getClass().getSimpleName());
        arrayList.add("Cause: " + th2.getCause() + ", Stacktrace: " + Log.getStackTraceString(th2));
        return arrayList;
    }

    public static com.google.android.gms.internal.auth.w H(com.google.android.gms.internal.auth.w wVar) {
        if ((wVar instanceof com.google.android.gms.internal.auth.z) || (wVar instanceof com.google.android.gms.internal.auth.x)) {
            return wVar;
        }
        if (wVar instanceof Serializable) {
            return new com.google.android.gms.internal.auth.x(wVar);
        }
        com.google.android.gms.internal.auth.z zVar = new com.google.android.gms.internal.auth.z();
        zVar.f13311b = wVar;
        return zVar;
    }

    public static void I(Context context) {
        boolean z5;
        Object obj = u9.f.f34380b;
        if (((Boolean) yl.f12652a.r()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    synchronized (u9.f.f34380b) {
                        z5 = u9.f.f34381c;
                    }
                    if (z5) {
                        return;
                    }
                    ed.d dVarB = new zw(context).B();
                    u9.i.g("Updating ad debug logging enablement.");
                    ix.m(dVarB, "AdDebugLogUpdater.updateEnablement");
                }
            } catch (Exception e3) {
                u9.i.i("Fail to determine debug setting.", e3);
            }
        }
    }

    public static c5 J() {
        String str;
        ClassLoader classLoader = h5.class.getClassLoader();
        if (c5.class.equals(c5.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!c5.class.getPackage().equals(h5.class.getPackage())) {
                throw new IllegalArgumentException(c5.class.getName());
            }
            str = c5.class.getPackage().getName() + ".BlazeGenerated" + c5.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    a0.u.q(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (InstantiationException e3) {
                    throw new IllegalStateException(e3);
                } catch (NoSuchMethodException e7) {
                    throw new IllegalStateException(e7);
                }
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException(e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new h5[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e12) {
                        Logger.getLogger(a5.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(c5.class.getSimpleName()), (Throwable) e12);
                    }
                }
                if (arrayList.size() == 1) {
                    return (c5) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (c5) c5.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e13) {
                    throw new IllegalStateException(e13);
                } catch (NoSuchMethodException e14) {
                    throw new IllegalStateException(e14);
                } catch (InvocationTargetException e15) {
                    throw new IllegalStateException(e15);
                }
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(th2.getMessage(), th2);
            }
        }
    }

    public static final a6.b a(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        return new a6.b(backEvent.getSwipeEdge(), backEvent.getProgress(), touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static String b(int i, int i10, String str) {
        if (i < 0) {
            return hl.d.q("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i10 >= 0) {
            return hl.d.q("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(l7.o.i(i10, "negative size: "));
    }

    public static final void c(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        g2.s0 block = new g2.s0(view, null);
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(block, "block");
        ek.k kVar = new ek.k();
        kVar.f16416e = nj.f.a(block, kVar, kVar);
        while (kVar.hasNext()) {
            View view2 = (View) kVar.next();
            l2.a aVar = (l2.a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new l2.a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList = aVar.f27748a;
            int iE = kotlin.collections.s.e(arrayList);
            if (-1 < iE) {
                arrayList.get(iE).getClass();
                throw new ClassCastException();
            }
        }
    }

    public static void d(int i, int i10, String str, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(hl.d.q(str, Integer.valueOf(i), Integer.valueOf(i10)));
        }
    }

    public static void e(int i, String str, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(hl.d.q(str, Integer.valueOf(i)));
        }
    }

    public static void f(String str, long j10, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(hl.d.q(str, Long.valueOf(j10)));
        }
    }

    public static void g(String str, boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void h(boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException();
        }
    }

    public static void i(boolean z5, String str, long j10, long j11) {
        if (!z5) {
            throw new IllegalArgumentException(hl.d.q(str, Long.valueOf(j10), Long.valueOf(j11)));
        }
    }

    public static void j(boolean z5, String str, Object obj) {
        if (!z5) {
            throw new IllegalArgumentException(hl.d.q(str, obj));
        }
    }

    public static void k(boolean z5, String str, Object obj, Comparable comparable) {
        if (!z5) {
            throw new IllegalArgumentException(hl.d.q(str, obj, comparable));
        }
    }

    public static void l(int i, int i10) {
        String strQ;
        if (i < 0 || i >= i10) {
            if (i < 0) {
                strQ = hl.d.q("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(l7.o.i(i10, "negative size: "));
                }
                strQ = hl.d.q("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strQ);
        }
    }

    public static void m(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void n(s3.j0 j0Var) {
        j0Var.getClass();
    }

    public static void o(int i, int i10) {
        if (i < 0 || i > i10) {
            throw new IndexOutOfBoundsException(b(i, i10, "index"));
        }
    }

    public static void p(int i, int i10, int i11) {
        if (i < 0 || i10 < i || i10 > i11) {
            throw new IndexOutOfBoundsException((i < 0 || i > i11) ? b(i, i11, "start index") : (i10 < 0 || i10 > i11) ? b(i10, i11, "end index") : hl.d.q("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i)));
        }
    }

    public static void q(String str, boolean z5) {
        if (!z5) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void r(boolean z5) {
        if (!z5) {
            throw new IllegalStateException();
        }
    }

    public static final ij.l s(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new ij.l(exception);
    }

    public static final Class t(dk.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Class clsA = ((kotlin.jvm.internal.g) cVar).a();
        Intrinsics.c(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class u(dk.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Class clsA = ((kotlin.jvm.internal.g) cVar).a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    public static SharedPreferences v(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static me.p w(re.b bVar) {
        boolean z5 = bVar.f32298c;
        bVar.f32298c = true;
        try {
            try {
                try {
                    return oe.d.k(bVar);
                } catch (OutOfMemoryError e3) {
                    throw new oc("Failed parsing JSON source: " + bVar + " to Json", e3);
                }
            } catch (StackOverflowError e7) {
                throw new oc("Failed parsing JSON source: " + bVar + " to Json", e7);
            }
        } finally {
            bVar.f32298c = z5;
        }
    }

    public static me.p x(String str) {
        try {
            re.b bVar = new re.b(new StringReader(str));
            me.p pVarW = w(bVar);
            if (!(pVarW instanceof me.r) && bVar.s() != 10) {
                throw new me.q("Did not consume the entire document.");
            }
            return pVarW;
        } catch (IOException e3) {
            throw new me.q(e3);
        } catch (NumberFormatException e7) {
            throw new me.q(e7);
        } catch (re.d e10) {
            throw new me.q(e10);
        }
    }

    public static void y(bi.d dVar, MediaExtractor mediaExtractor) {
        try {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                String string = trackFormat.getString("mime");
                if (string != null && string.startsWith("image/")) {
                    int integer = trackFormat.containsKey("rotation-degrees") ? trackFormat.getInteger("rotation-degrees") : 0;
                    int i10 = dVar.f2160g;
                    int i11 = dVar.f2159f;
                    if (integer != 90 && integer != 270) {
                        i11 = i10;
                        i10 = i11;
                    }
                    dVar.f2156c = i10;
                    dVar.f2154a = i11;
                    dVar.f2157d = integer;
                    return;
                }
            }
        } catch (Exception e3) {
            Log.e("MediaMetadataReader", "Failed to decode HEIF image using MediaExtractor", e3);
        }
    }

    public static void z(Context context, q9.o oVar, boolean z5) {
        sb.m mVarQ;
        int i;
        if (Build.VERSION.SDK_INT >= 29) {
            SharedPreferences sharedPreferencesV = v(context);
            if (sharedPreferencesV.contains("proxy_retention") && sharedPreferencesV.getBoolean("proxy_retention", false) == z5) {
                return;
            }
            la.b bVar = (la.b) oVar.f31948c;
            if (bVar.f28065c.l() >= 241100000) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("proxy_retention", z5);
                la.m mVarL = la.m.l(bVar.f28064b);
                synchronized (mVarL) {
                    i = mVarL.f28098c;
                    mVarL.f28098c = i + 1;
                }
                mVarQ = mVarL.n(new la.l(i, 4, bundle, 0));
            } else {
                mVarQ = b4.q(new IOException("SERVICE_NOT_AVAILABLE"));
            }
            mVarQ.d(new com.yandex.div.core.dagger.b(1), new com.google.firebase.messaging.v(context, z5));
        }
    }

    public int hashCode() {
        switch (this.f13772a) {
            case 14:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f13772a) {
            case 14:
                String strD = kotlin.jvm.internal.g0.a(getClass()).d();
                Intrinsics.b(strD);
                return strD;
            default:
                return super.toString();
        }
    }
}
