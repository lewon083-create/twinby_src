package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.media.MediaCodecInfo;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import android.util.Log;
import com.google.android.gms.internal.ads.ab;
import com.google.android.gms.internal.ads.bq0;
import com.google.android.gms.internal.ads.ji0;
import com.google.android.gms.tasks.Task;
import com.vk.api.sdk.exceptions.VKApiCodes;
import io.sentry.ISentryLifecycleToken;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;
import m.h3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b4 implements cf.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static m.h3 f13669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Class f13670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f13671e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13672b;

    public static int C(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new IllegalArgumentException(l7.o.i(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static boolean D(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean E() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static final boolean F(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.a(method, "GET") || Intrinsics.a(method, "HEAD")) ? false : true;
    }

    public static void G(Runnable runnable) {
        if (E()) {
            runnable.run();
        } else {
            f2.g.h("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    public static void H(ii.f binaryMessenger, final fj.t tVar) {
        a1.m mVar;
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m nVar = (tVar == null || (mVar = tVar.f19420a) == null) ? new cj.n(1) : mVar.m();
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedBy", nVar, obj);
        if (tVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: fj.d0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    X509Certificate x509Certificate;
                    switch (i) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                tVar2.getClass();
                                listF = kotlin.collections.r.c(sslCertificate.getIssuedBy());
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                tVar3.getClass();
                                listF2 = kotlin.collections.r.c(sslCertificate2.getIssuedTo());
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                tVar4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listF3 = kotlin.collections.r.c(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                tVar5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listF4 = kotlin.collections.r.c(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                tVar6.f19420a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listF5 = kotlin.collections.r.c(x509Certificate);
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
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getIssuedTo", nVar, obj);
        if (tVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: fj.d0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    X509Certificate x509Certificate;
                    switch (i10) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                tVar2.getClass();
                                listF = kotlin.collections.r.c(sslCertificate.getIssuedBy());
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                tVar3.getClass();
                                listF2 = kotlin.collections.r.c(sslCertificate2.getIssuedTo());
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                tVar4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listF3 = kotlin.collections.r.c(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                tVar5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listF4 = kotlin.collections.r.c(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                tVar6.f19420a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listF5 = kotlin.collections.r.c(x509Certificate);
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
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotAfterMsSinceEpoch", nVar, obj);
        if (tVar != null) {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: fj.d0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    X509Certificate x509Certificate;
                    switch (i11) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                tVar2.getClass();
                                listF = kotlin.collections.r.c(sslCertificate.getIssuedBy());
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                tVar3.getClass();
                                listF2 = kotlin.collections.r.c(sslCertificate2.getIssuedTo());
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                tVar4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listF3 = kotlin.collections.r.c(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                tVar5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listF4 = kotlin.collections.r.c(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                tVar6.f19420a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listF5 = kotlin.collections.r.c(x509Certificate);
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
                    }
                }
            });
        } else {
            gVar3.L(null);
        }
        s7.g gVar4 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getValidNotBeforeMsSinceEpoch", nVar, obj);
        if (tVar != null) {
            final int i12 = 3;
            gVar4.L(new ii.b() { // from class: fj.d0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    X509Certificate x509Certificate;
                    switch (i12) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                tVar2.getClass();
                                listF = kotlin.collections.r.c(sslCertificate.getIssuedBy());
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                tVar3.getClass();
                                listF2 = kotlin.collections.r.c(sslCertificate2.getIssuedTo());
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                tVar4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listF3 = kotlin.collections.r.c(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                tVar5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listF4 = kotlin.collections.r.c(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                tVar6.f19420a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listF5 = kotlin.collections.r.c(x509Certificate);
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
                    }
                }
            });
        } else {
            gVar4.L(null);
        }
        s7.g gVar5 = new s7.g(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.getX509Certificate", nVar, obj);
        if (tVar == null) {
            gVar5.L(null);
        } else {
            final int i13 = 4;
            gVar5.L(new ii.b() { // from class: fj.d0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    List listF4;
                    List listF5;
                    X509Certificate x509Certificate;
                    switch (i13) {
                        case 0:
                            t tVar2 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate = (SslCertificate) obj3;
                            try {
                                tVar2.getClass();
                                listF = kotlin.collections.r.c(sslCertificate.getIssuedBy());
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
                            t tVar3 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate2 = (SslCertificate) obj4;
                            try {
                                tVar3.getClass();
                                listF2 = kotlin.collections.r.c(sslCertificate2.getIssuedTo());
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
                            t tVar4 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate3 = (SslCertificate) obj5;
                            try {
                                tVar4.getClass();
                                Date validNotAfterDate = sslCertificate3.getValidNotAfterDate();
                                listF3 = kotlin.collections.r.c(validNotAfterDate != null ? Long.valueOf(validNotAfterDate.getTime()) : null);
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
                            t tVar5 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj2).get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate4 = (SslCertificate) obj6;
                            try {
                                tVar5.getClass();
                                Date validNotBeforeDate = sslCertificate4.getValidNotBeforeDate();
                                listF4 = kotlin.collections.r.c(validNotBeforeDate != null ? Long.valueOf(validNotBeforeDate.getTime()) : null);
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
                        default:
                            t tVar6 = tVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj7 = ((List) obj2).get(0);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type android.net.http.SslCertificate");
                            SslCertificate sslCertificate5 = (SslCertificate) obj7;
                            try {
                                tVar6.f19420a.getClass();
                                if (Build.VERSION.SDK_INT >= 29) {
                                    x509Certificate = sslCertificate5.getX509Certificate();
                                } else {
                                    Log.d("SslCertificateProxyApi", "SslCertificate.getX509Certificate requires Build.VERSION_CODES.Q.");
                                    x509Certificate = null;
                                }
                                listF5 = kotlin.collections.r.c(x509Certificate);
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
                    }
                }
            });
        }
    }

    public static void I(ii.f binaryMessenger, final ni.f fVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA = fVar != null ? fVar.f29389a.a() : new cj.n(2);
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraCharacteristics.infoSupportedHardwareLevel", mVarA, obj);
        if (fVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: ni.k0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i) {
                        case 0:
                            f fVar2 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar2.f29389a.f6853d).a(((Long) obj3).longValue(), CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
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
                            f fVar3 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar3.f29389a.f6853d).a(((Long) obj4).longValue(), CameraCharacteristics.SENSOR_ORIENTATION);
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
                        default:
                            f fVar4 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar4.f29389a.f6853d).a(((Long) obj5).longValue(), CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
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
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraCharacteristics.sensorOrientation", mVarA, obj);
        if (fVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: ni.k0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i10) {
                        case 0:
                            f fVar2 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar2.f29389a.f6853d).a(((Long) obj3).longValue(), CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
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
                            f fVar3 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar3.f29389a.f6853d).a(((Long) obj4).longValue(), CameraCharacteristics.SENSOR_ORIENTATION);
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
                        default:
                            f fVar4 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar4.f29389a.f6853d).a(((Long) obj5).longValue(), CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
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
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.CameraCharacteristics.controlAvailableVideoStabilizationModes", mVarA, obj);
        if (fVar == null) {
            gVar3.L(null);
        } else {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: ni.k0
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    List listF3;
                    switch (i11) {
                        case 0:
                            f fVar2 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar2.f29389a.f6853d).a(((Long) obj3).longValue(), CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
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
                            f fVar3 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj4 = ((List) obj2).get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar3.f29389a.f6853d).a(((Long) obj4).longValue(), CameraCharacteristics.SENSOR_ORIENTATION);
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
                        default:
                            f fVar4 = fVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj5 = ((List) obj2).get(0);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) fVar4.f29389a.f6853d).a(((Long) obj5).longValue(), CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
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
                    }
                }
            });
        }
    }

    public static void J(ii.f binaryMessenger, final ni.m mVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        ii.m mVarA = mVar != null ? mVar.f29437a.a() : new cj.n(2);
        Object obj = null;
        s7.g gVar = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.SystemServicesManager.pigeon_defaultConstructor", mVarA, obj);
        if (mVar != null) {
            final int i = 0;
            gVar.L(new ii.b() { // from class: ni.e1
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    switch (i) {
                        case 0:
                            m mVar2 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) mVar2.f29437a.f6853d).a(((Long) obj3).longValue(), new m1(mVar2));
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
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.camerax.SystemServicesManager");
                            m1 m1Var = (m1) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            fj.z zVar = new fj.z(reply, 10);
                            mVar.getClass();
                            x0 x0Var = new x0(20, zVar);
                            ji0 ji0Var = m1Var.f29441b.f29437a;
                            Context context = (Context) ji0Var.f6857h;
                            if (!(context instanceof Activity)) {
                                throw new IllegalStateException("Activity must be set to request camera permissions.");
                            }
                            fd.b bVar = m1Var.f29440a;
                            Activity activity = (Activity) context;
                            he.e eVar = (he.e) ji0Var.i;
                            x0 x0Var2 = new x0(19, x0Var);
                            if (bVar.f16748a) {
                                x0Var2.a(new j("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once."));
                                return;
                            }
                            if (t1.b.a(activity, "android.permission.CAMERA") == 0 && (!zBooleanValue || t1.b.a(activity, "android.permission.RECORD_AUDIO") == 0)) {
                                x0Var2.a(null);
                                return;
                            }
                            ((h3) ((fi.b) eVar.f20503c)).b(new k(new a0.y(21, bVar, x0Var2)));
                            bVar.f16748a = true;
                            t1.b.e(activity, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        default:
                            m mVar3 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.camerax.SystemServicesManager");
                            m1 m1Var2 = (m1) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj7;
                            Object obj8 = list2.get(2);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj8;
                            try {
                                mVar3.getClass();
                                listF2 = kotlin.collections.r.c(m.a(m1Var2, str, str2));
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
                            return;
                    }
                }
            });
        } else {
            gVar.L(null);
        }
        s7.g gVar2 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.SystemServicesManager.requestCameraPermissions", mVarA, obj);
        if (mVar != null) {
            final int i10 = 1;
            gVar2.L(new ii.b() { // from class: ni.e1
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    switch (i10) {
                        case 0:
                            m mVar2 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) mVar2.f29437a.f6853d).a(((Long) obj3).longValue(), new m1(mVar2));
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
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.camerax.SystemServicesManager");
                            m1 m1Var = (m1) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            fj.z zVar = new fj.z(reply, 10);
                            mVar.getClass();
                            x0 x0Var = new x0(20, zVar);
                            ji0 ji0Var = m1Var.f29441b.f29437a;
                            Context context = (Context) ji0Var.f6857h;
                            if (!(context instanceof Activity)) {
                                throw new IllegalStateException("Activity must be set to request camera permissions.");
                            }
                            fd.b bVar = m1Var.f29440a;
                            Activity activity = (Activity) context;
                            he.e eVar = (he.e) ji0Var.i;
                            x0 x0Var2 = new x0(19, x0Var);
                            if (bVar.f16748a) {
                                x0Var2.a(new j("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once."));
                                return;
                            }
                            if (t1.b.a(activity, "android.permission.CAMERA") == 0 && (!zBooleanValue || t1.b.a(activity, "android.permission.RECORD_AUDIO") == 0)) {
                                x0Var2.a(null);
                                return;
                            }
                            ((h3) ((fi.b) eVar.f20503c)).b(new k(new a0.y(21, bVar, x0Var2)));
                            bVar.f16748a = true;
                            t1.b.e(activity, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        default:
                            m mVar3 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.camerax.SystemServicesManager");
                            m1 m1Var2 = (m1) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj7;
                            Object obj8 = list2.get(2);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj8;
                            try {
                                mVar3.getClass();
                                listF2 = kotlin.collections.r.c(m.a(m1Var2, str, str2));
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
                            return;
                    }
                }
            });
        } else {
            gVar2.L(null);
        }
        s7.g gVar3 = new s7.g(binaryMessenger, "dev.flutter.pigeon.camera_android_camerax.SystemServicesManager.getTempFilePath", mVarA, obj);
        if (mVar == null) {
            gVar3.L(null);
        } else {
            final int i11 = 2;
            gVar3.L(new ii.b() { // from class: ni.e1
                @Override // ii.b
                public final void q(Object obj2, h3.e reply) {
                    List listF;
                    List listF2;
                    switch (i11) {
                        case 0:
                            m mVar2 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((fj.c) mVar2.f29437a.f6853d).a(((Long) obj3).longValue(), new m1(mVar2));
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
                            return;
                        case 1:
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.camerax.SystemServicesManager");
                            m1 m1Var = (m1) obj4;
                            Object obj5 = list.get(1);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            fj.z zVar = new fj.z(reply, 10);
                            mVar.getClass();
                            x0 x0Var = new x0(20, zVar);
                            ji0 ji0Var = m1Var.f29441b.f29437a;
                            Context context = (Context) ji0Var.f6857h;
                            if (!(context instanceof Activity)) {
                                throw new IllegalStateException("Activity must be set to request camera permissions.");
                            }
                            fd.b bVar = m1Var.f29440a;
                            Activity activity = (Activity) context;
                            he.e eVar = (he.e) ji0Var.i;
                            x0 x0Var2 = new x0(19, x0Var);
                            if (bVar.f16748a) {
                                x0Var2.a(new j("CameraPermissionsRequestOngoing", "Another request is ongoing and multiple requests cannot be handled at once."));
                                return;
                            }
                            if (t1.b.a(activity, "android.permission.CAMERA") == 0 && (!zBooleanValue || t1.b.a(activity, "android.permission.RECORD_AUDIO") == 0)) {
                                x0Var2.a(null);
                                return;
                            }
                            ((h3) ((fi.b) eVar.f20503c)).b(new k(new a0.y(21, bVar, x0Var2)));
                            bVar.f16748a = true;
                            t1.b.e(activity, zBooleanValue ? new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"} : new String[]{"android.permission.CAMERA"}, 9796);
                            return;
                        default:
                            m mVar3 = mVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj2;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.camerax.SystemServicesManager");
                            m1 m1Var2 = (m1) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj7;
                            Object obj8 = list2.get(2);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj8;
                            try {
                                mVar3.getClass();
                                listF2 = kotlin.collections.r.c(m.a(m1Var2, str, str2));
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
                            return;
                    }
                }
            });
        }
    }

    public static byte[] K(ab abVar) {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i10 = 0;
            while (i10 < iMin2) {
                int i11 = abVar.read(bArr, i10, iMin2 - i10);
                if (i11 == -1) {
                    return g(arrayDeque, i);
                }
                i10 += i11;
                i += i11;
            }
            long j10 = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            iMin = j10 > 2147483647L ? Integer.MAX_VALUE : j10 < -2147483648L ? VKApiCodes.CODE_COMPOSITE_EXECUTE_ERROR : (int) j10;
        }
        if (abVar.read() == -1) {
            return g(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static Task L(Task... taskArr) {
        sb.m mVar;
        if (taskArr.length == 0) {
            return s(Collections.EMPTY_LIST);
        }
        List<Task> listAsList = Arrays.asList(taskArr);
        j0.f fVar = sb.h.f32859a;
        if (listAsList == null || listAsList.isEmpty()) {
            return s(Collections.EMPTY_LIST);
        }
        if (listAsList.isEmpty()) {
            mVar = s(null);
        } else {
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                if (((Task) it.next()) == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            mVar = new sb.m();
            sb.i iVar = new sb.i(listAsList.size(), mVar);
            for (Task task : listAsList) {
                j0.b bVar = sb.h.f32860b;
                task.d(bVar, iVar);
                task.c(bVar, iVar);
                task.a(bVar, iVar);
            }
        }
        m4.d dVar = new m4.d();
        dVar.f28630b = listAsList;
        return mVar.f(fVar, dVar);
    }

    public static int M(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i10 = 0; i10 < 6; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == i) {
                return i11;
            }
        }
        return 1;
    }

    public static Object N(Task task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.h()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    public static List O(JSONArray jSONArray, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        return arrayList;
    }

    public static ArrayList P(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static JSONObject Q(JsonReader jsonReader) {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, R(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, Q(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                }
                jSONObject.put(strNextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static JSONArray R(JsonReader jsonReader) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONArray.put(R(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONArray.put(Q(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                }
                jSONArray.put(jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static void S(JsonWriter jsonWriter, JSONObject jSONObject) throws IOException {
        try {
            jsonWriter.beginObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    S(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String strValueOf = String.valueOf(obj);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 23);
                        sb2.append("unable to write field: ");
                        sb2.append(strValueOf);
                        throw new JSONException(sb2.toString());
                    }
                    T(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e3) {
            throw new IOException(e3);
        }
    }

    public static void T(JsonWriter jsonWriter, JSONArray jSONArray) throws IOException {
        try {
            jsonWriter.beginArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    S(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String strValueOf = String.valueOf(obj);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 23);
                        sb2.append("unable to write field: ");
                        sb2.append(strValueOf);
                        throw new JSONException(sb2.toString());
                    }
                    T(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e3) {
            throw new IOException(e3);
        }
    }

    public static JSONObject U(String str, JSONObject jSONObject) throws JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static Bundle V(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof Double) {
                    bundle.putDouble(next, ((Double) objOpt).doubleValue());
                } else if (objOpt instanceof Integer) {
                    bundle.putInt(next, ((Integer) objOpt).intValue());
                } else if (objOpt instanceof Long) {
                    bundle.putLong(next, ((Long) objOpt).longValue());
                } else if (objOpt instanceof String) {
                    bundle.putString(next, (String) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i = 0;
                        Object objOpt2 = null;
                        for (int i10 = 0; objOpt2 == null && i10 < length; i10++) {
                            objOpt2 = !jSONArray.isNull(i10) ? jSONArray.opt(i10) : null;
                        }
                        if (objOpt2 == null) {
                            u9.i.h("Expected JSONArray with at least 1 non-null element for key:".concat(String.valueOf(next)));
                        } else if (objOpt2 instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i < length) {
                                bundleArr[i] = !jSONArray.isNull(i) ? V(jSONArray.optJSONObject(i)) : null;
                                i++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (objOpt2 instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i < length) {
                                dArr[i] = jSONArray.optDouble(i);
                                i++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (objOpt2 instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i < length) {
                                strArr[i] = !jSONArray.isNull(i) ? jSONArray.optString(i) : null;
                                i++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (objOpt2 instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i < length) {
                                zArr[i] = jSONArray.optBoolean(i);
                                i++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            u9.i.h("JSONArray with unsupported type " + objOpt2.getClass().getCanonicalName() + " for key:" + next);
                        }
                    }
                } else if (objOpt instanceof JSONObject) {
                    bundle.putBundle(next, V((JSONObject) objOpt));
                } else {
                    u9.i.h("Unsupported type for key:".concat(String.valueOf(next)));
                }
            }
        }
        return bundle;
    }

    public static String W(bq0 bq0Var) {
        if (bq0Var == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            X(jsonWriter, bq0Var);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e3) {
            u9.i.f("Error when writing JSON.", e3);
            return null;
        }
    }

    public static void X(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof bq0) {
            S(jsonWriter, ((bq0) obj).f3855d);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                X(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                X(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }

    public static JSONObject Y(JSONObject jSONObject, String[] strArr) {
        for (int i = 0; i < strArr.length - 1; i = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0084 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0087 -> B:25:0x0067). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.util.List r6, p2.l r7, oj.c r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof p2.e
            if (r0 == 0) goto L13
            r0 = r8
            p2.e r0 = (p2.e) r0
            int r1 = r0.f30950o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30950o = r1
            goto L18
        L13:
            p2.e r0 = new p2.e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f30949n
            nj.a r1 = nj.a.f29512b
            int r2 = r0.f30950o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.f30948m
            java.io.Serializable r7 = r0.f30947l
            kotlin.jvm.internal.f0 r7 = (kotlin.jvm.internal.f0) r7
            com.google.android.gms.internal.measurement.h5.E(r8)     // Catch: java.lang.Throwable -> L30
            goto L67
        L30:
            r8 = move-exception
            goto L80
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f30947l
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.measurement.h5.E(r8)
            goto L5c
        L42:
            com.google.android.gms.internal.measurement.h5.E(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            p2.g r2 = new p2.g
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f30947l = r8
            r0.f30950o = r4
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L5b
            goto L95
        L5b:
            r6 = r8
        L5c:
            kotlin.jvm.internal.f0 r7 = new kotlin.jvm.internal.f0
            r7.<init>()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L67:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8d
            java.lang.Object r8 = r6.next()
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r0.f30947l = r7     // Catch: java.lang.Throwable -> L30
            r0.f30948m = r6     // Catch: java.lang.Throwable -> L30
            r0.f30950o = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L67
            goto L95
        L80:
            java.lang.Object r2 = r7.f27510b
            if (r2 != 0) goto L87
            r7.f27510b = r8
            goto L67
        L87:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            ij.d.a(r2, r8)
            goto L67
        L8d:
            java.lang.Object r6 = r7.f27510b
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L96
            kotlin.Unit r1 = kotlin.Unit.f27471a
        L95:
            return r1
        L96:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.b4.a(java.util.List, p2.l, oj.c):java.lang.Object");
    }

    public static Object b(Task task) throws InterruptedException {
        pa.c0.h("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        pa.c0.j(task, "Task must not be null");
        if (task.i()) {
            return N(task);
        }
        he.b bVar = new he.b(2);
        Executor executor = sb.h.f32860b;
        task.d(executor, bVar);
        task.c(executor, bVar);
        task.a(executor, bVar);
        bVar.f20488c.await();
        return N(task);
    }

    public static Object c(Task task, long j10, TimeUnit timeUnit) throws TimeoutException {
        pa.c0.h("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
        }
        pa.c0.j(task, "Task must not be null");
        pa.c0.j(timeUnit, "TimeUnit must not be null");
        if (task.i()) {
            return N(task);
        }
        he.b bVar = new he.b(2);
        Executor executor = sb.h.f32860b;
        task.d(executor, bVar);
        task.c(executor, bVar);
        task.a(executor, bVar);
        if (bVar.f20488c.await(j10, timeUnit)) {
            return N(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static sb.m d(Callable callable, Executor executor) {
        pa.c0.j(executor, "Executor must not be null");
        sb.m mVar = new sb.m();
        executor.execute(new ob.b3(7, mVar, callable, false));
        return mVar;
    }

    public static void e() {
        f2.g.h("Not in application's main thread", E());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(ISentryLifecycleToken iSentryLifecycleToken, Throwable th2) {
        boolean zIsTerminated;
        if (iSentryLifecycleToken != 0) {
            if (th2 != null) {
                try {
                    pe.a.p(iSentryLifecycleToken);
                    return;
                } catch (Throwable th3) {
                    ij.d.a(th2, th3);
                    return;
                }
            }
            if (iSentryLifecycleToken instanceof AutoCloseable) {
                iSentryLifecycleToken.close();
                return;
            }
            if (!(iSentryLifecycleToken instanceof ExecutorService)) {
                if (iSentryLifecycleToken instanceof TypedArray) {
                    ((TypedArray) iSentryLifecycleToken).recycle();
                    return;
                } else if (iSentryLifecycleToken instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) iSentryLifecycleToken).release();
                    return;
                } else {
                    if (!(iSentryLifecycleToken instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) iSentryLifecycleToken).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) iSentryLifecycleToken;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z5 = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z5) {
                        executorService.shutdownNow();
                        z5 = true;
                    }
                }
            }
            if (z5) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static byte[] g(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static int o(boolean z5) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            j3.n nVar = new j3.n();
            nVar.f26292m = j3.c0.n("video/avc");
            j3.o oVar = new j3.o(nVar);
            String str = oVar.f26335n;
            if (str != null) {
                List listE = b4.y.e(str, z5, false);
                String strC = b4.y.c(oVar);
                Iterable iterableE = strC == null ? ad.b1.f768f : b4.y.e(strC, z5, false);
                ad.g0 g0VarQ = ad.j0.q();
                g0VarQ.d(listE);
                g0VarQ.d(iterableE);
                ad.b1 b1VarG = g0VarQ.g();
                for (int i = 0; i < b1VarG.f770e; i++) {
                    if (((b4.p) b1VarG.get(i)).f1910d != null && (videoCapabilities = ((b4.p) b1VarG.get(i)).f1910d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        androidx.lifecycle.j0.m();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointC = androidx.lifecycle.j0.c();
                        for (int i10 = 0; i10 < supportedPerformancePoints.size(); i10++) {
                            if (androidx.lifecycle.j0.e(supportedPerformancePoints.get(i10)).covers(performancePointC)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (b4.v unused) {
        }
        return 0;
    }

    public static d2.i p(d2.i[] iVarArr, int i) {
        int i10 = (i & 1) == 0 ? 400 : 700;
        boolean z5 = (i & 2) != 0;
        d2.i iVar = null;
        int i11 = Integer.MAX_VALUE;
        for (d2.i iVar2 : iVarArr) {
            int iAbs = (Math.abs(iVar2.f15550c - i10) * 2) + (iVar2.f15551d == z5 ? 0 : 1);
            if (iVar == null || i11 > iAbs) {
                iVar = iVar2;
                i11 = iAbs;
            }
        }
        return iVar;
    }

    public static sb.m q(Exception exc) {
        sb.m mVar = new sb.m();
        mVar.m(exc);
        return mVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static zk.h0 r(String javaName) {
        Intrinsics.checkNotNullParameter(javaName, "javaName");
        int iHashCode = javaName.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (javaName.equals("TLSv1.1")) {
                            return zk.h0.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (javaName.equals("TLSv1.2")) {
                            return zk.h0.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (javaName.equals("TLSv1.3")) {
                            return zk.h0.TLS_1_3;
                        }
                        break;
                }
            } else if (javaName.equals("TLSv1")) {
                return zk.h0.TLS_1_0;
            }
        } else if (javaName.equals("SSLv3")) {
            return zk.h0.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
    }

    public static sb.m s(Object obj) {
        sb.m mVar = new sb.m();
        mVar.l(obj);
        return mVar;
    }

    public static ColorStateList u(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListB;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = t1.b.b(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListB;
    }

    public static ColorStateList v(Context context, ka.k kVar, int i) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = (TypedArray) kVar.f27325d;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListB = t1.b.b(context, resourceId)) == null) ? kVar.E(i) : colorStateListB;
    }

    public static Drawable w(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableI;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableI = a.a.i(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableI;
    }

    public bf.n A() {
        return new bf.n((String) t("sql"), (List) t("arguments"));
    }

    public abstract boolean B();

    public abstract Typeface h(Context context, w1.e eVar, Resources resources, int i);

    public abstract Typeface i(Context context, d2.i[] iVarArr, int i);

    public Typeface j(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface k(Context context, Resources resources, int i, String str, int i10) {
        File fileK = d4.k(context);
        if (fileK == null) {
            return null;
        }
        try {
            if (d4.a(fileK, resources, i)) {
                return Typeface.createFromFile(fileK.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileK.delete();
        }
    }

    public j3.b0 l(z4.a aVar) {
        ByteBuffer byteBuffer = aVar.f32192f;
        byteBuffer.getClass();
        h5.h(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return m(aVar, byteBuffer);
    }

    public abstract j3.b0 m(z4.a aVar, ByteBuffer byteBuffer);

    @Override // cf.c
    public void n(Object obj, String str) {
        z().n(obj, str);
    }

    @Override // cf.c
    public void success(Object obj) {
        z().success(obj);
    }

    public abstract Object t(String str);

    public String toString() {
        switch (this.f13672b) {
            case 3:
                return x() + " " + ((String) t("sql")) + " " + ((List) t("arguments"));
            default:
                return super.toString();
        }
    }

    public abstract String x();

    public boolean y() {
        return Boolean.TRUE.equals(t("noResult"));
    }

    public abstract cf.c z();

    public b4() {
        this.f13672b = 17;
        new ConcurrentHashMap();
    }
}
