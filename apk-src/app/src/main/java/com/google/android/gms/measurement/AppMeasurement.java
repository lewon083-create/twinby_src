package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.t0;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import mb.a;
import mb.b;
import mb.c;
import ob.l1;
import ob.l2;
import ob.y1;
import pa.c0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile AppMeasurement f14417b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f14418a;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;
    }

    public AppMeasurement(l1 l1Var) {
        this.f14418a = new a(l1Var);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f14417b == null) {
            synchronized (AppMeasurement.class) {
                if (f14417b == null) {
                    l2 l2Var = (l2) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (l2Var != null) {
                        f14417b = new AppMeasurement(l2Var);
                    } else {
                        f14417b = new AppMeasurement(l1.r(context, new t0(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return f14417b;
    }

    public void beginAdUnitExposure(String str) {
        this.f14418a.c0(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f14418a.h0(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.f14418a.f0(str);
    }

    public long generateEventId() {
        return this.f14418a.e();
    }

    public String getAppInstanceId() {
        return this.f14418a.d();
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listI0 = this.f14418a.i0(str, str2);
        ArrayList arrayList = new ArrayList(listI0 == null ? 0 : listI0.size());
        for (Bundle bundle : listI0) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            c0.i(bundle);
            conditionalUserProperty.mAppId = (String) y1.e(bundle, CommonUrlParts.APP_ID, String.class, null);
            conditionalUserProperty.mOrigin = (String) y1.e(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) y1.e(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = y1.e(bundle, "value", Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) y1.e(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) y1.e(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) y1.e(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) y1.e(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) y1.e(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) y1.e(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) y1.e(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) y1.e(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) y1.e(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) y1.e(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) y1.e(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) y1.e(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.f14418a.f();
    }

    public String getCurrentScreenName() {
        return this.f14418a.m();
    }

    public String getGmpAppId() {
        return this.f14418a.n();
    }

    public int getMaxUserProperties(String str) {
        return this.f14418a.j0(str);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z5) {
        return this.f14418a.k0(str, str2, z5);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f14418a.g0(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        c0.i(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString(CommonUrlParts.APP_ID, str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            y1.c(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f14418a.W(bundle);
    }

    public AppMeasurement(l2 l2Var) {
        this.f14418a = new b(l2Var);
    }
}
