package fe;

import a7.l;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import b4.n;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.al;
import com.google.android.gms.internal.ads.c3;
import com.google.android.gms.internal.ads.cp1;
import com.google.android.gms.internal.ads.k81;
import com.google.android.gms.internal.ads.wk;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.play_billing.o1;
import com.vk.api.sdk.exceptions.VKApiCodes;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.varioqub.config.FetchError;
import com.yandex.varioqub.config.OnFetchCompleteListener;
import com.yandex.varioqub.config.model.ConfigValue;
import e1.c0;
import g2.g0;
import g2.n0;
import g2.x1;
import gb.h;
import gb.w;
import hi.g;
import i5.d;
import ii.f;
import ii.o;
import ii.p;
import ii.q;
import ii.x;
import j1.i;
import j3.d0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.MissingFormatArgumentException;
import java.util.UUID;
import k6.r1;
import k6.u1;
import k6.w0;
import kk.e;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l.j;
import m.q1;
import oa.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q4.z;
import q9.s;
import xh.k;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements k0.c, k81, e, n, bc.a, cf.c, f.b, NativeAdEventListener, m, ii.b, o, OnFetchCompleteListener, i, u1, r1, q1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile c f16783d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f16785c;

    public /* synthetic */ c(int i) {
        this.f16784b = i;
    }

    public static boolean G(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void I(ii.n nVar, p pVar) {
        ClipDescription primaryClipDescription;
        int i;
        hi.a aVarA;
        h3.e eVar = (h3.e) this.f16785c;
        if (((io.flutter.plugin.platform.n) eVar.f20376d) == null) {
            return;
        }
        String str = nVar.f21315a;
        Object obj = nVar.f21316b;
        try {
            boolean zHasMimeType = false;
            switch (str.hashCode()) {
                case -1501580720:
                    if (str.equals("SystemNavigator.setFrameworkHandlesBack")) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        xh.c cVar = (xh.c) ((d1.b) ((io.flutter.plugin.platform.n) eVar.f20376d).f25711c).f15510f;
                        if (cVar != null) {
                            k kVar = (k) cVar;
                            if (kVar.f45973g.getBoolean("should_automatically_handle_on_back_pressed", false)) {
                                kVar.Y.setEnabled(zBooleanValue);
                            }
                        }
                        ((g) pVar).success(null);
                    }
                    ((g) pVar).a();
                    break;
                case -931781241:
                    if (str.equals("Share.invoke")) {
                        d1.b bVar = (d1.b) ((io.flutter.plugin.platform.n) eVar.f20376d).f25711c;
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", (String) obj);
                        ((Activity) bVar.f15508d).startActivity(Intent.createChooser(intent, null));
                        ((g) pVar).success(null);
                    }
                    ((g) pVar).a();
                    break;
                case -766342101:
                    if (str.equals("SystemNavigator.pop")) {
                        ((io.flutter.plugin.platform.n) eVar.f20376d).f();
                        ((g) pVar).success(null);
                    }
                    ((g) pVar).a();
                    break;
                case -720677196:
                    if (str.equals("Clipboard.setData")) {
                        ((ClipboardManager) ((Activity) ((d1.b) ((io.flutter.plugin.platform.n) eVar.f20376d).f25711c).f15508d).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                        ((g) pVar).success(null);
                    }
                    ((g) pVar).a();
                    break;
                case -577225884:
                    if (str.equals("SystemChrome.setSystemUIChangeListener")) {
                        d1.b bVar2 = (d1.b) ((io.flutter.plugin.platform.n) eVar.f20376d).f25711c;
                        View decorView = ((Activity) bVar2.f15508d).getWindow().getDecorView();
                        decorView.setOnSystemUiVisibilityChangeListener(new io.flutter.plugin.platform.e(bVar2, decorView));
                        ((g) pVar).success(null);
                    }
                    ((g) pVar).a();
                    break;
                case -548468504:
                    if (str.equals("SystemChrome.setApplicationSwitcherDescription")) {
                        try {
                            JSONObject jSONObject = (JSONObject) obj;
                            int i10 = jSONObject.getInt("primaryColor");
                            if (i10 != 0) {
                                i10 |= -16777216;
                            }
                            String string = jSONObject.getString("label");
                            Activity activity = (Activity) ((d1.b) ((io.flutter.plugin.platform.n) eVar.f20376d).f25711c).f15508d;
                            if (Build.VERSION.SDK_INT < 28) {
                                activity.setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, i10));
                            } else {
                                activity.setTaskDescription(i8.c.f(i10, string));
                            }
                            ((g) pVar).success(null);
                        } catch (JSONException e3) {
                            ((g) pVar).b("error", e3.getMessage(), null);
                            return;
                        }
                    }
                    ((g) pVar).a();
                    break;
                case -247230243:
                    if (str.equals("HapticFeedback.vibrate")) {
                        try {
                            ((io.flutter.plugin.platform.n) eVar.f20376d).j(gf.a.b((String) obj));
                            ((g) pVar).success(null);
                        } catch (NoSuchFieldException e7) {
                            ((g) pVar).b("error", e7.getMessage(), null);
                            return;
                        }
                    }
                    ((g) pVar).a();
                    break;
                case -215273374:
                    if (str.equals("SystemSound.play")) {
                        try {
                            int iC = gf.a.c((String) obj);
                            d1.b bVar3 = (d1.b) ((io.flutter.plugin.platform.n) eVar.f20376d).f25711c;
                            if (iC == 1) {
                                ((Activity) bVar3.f15508d).getWindow().getDecorView().playSoundEffect(0);
                            }
                            ((g) pVar).success(null);
                        } catch (NoSuchFieldException e10) {
                            ((g) pVar).b("error", e10.getMessage(), null);
                            return;
                        }
                    }
                    ((g) pVar).a();
                    break;
                case 241845679:
                    if (str.equals("SystemChrome.restoreSystemUIOverlays")) {
                        ((d1.b) ((io.flutter.plugin.platform.n) eVar.f20376d).f25711c).E();
                        ((g) pVar).success(null);
                    }
                    ((g) pVar).a();
                    break;
                case 875995648:
                    if (str.equals("Clipboard.hasStrings")) {
                        ClipboardManager clipboardManager = (ClipboardManager) ((Activity) ((d1.b) ((io.flutter.plugin.platform.n) eVar.f20376d).f25711c).f15508d).getSystemService("clipboard");
                        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                            zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("value", zHasMimeType);
                        ((g) pVar).success(jSONObject2);
                    }
                    ((g) pVar).a();
                    break;
                case 1128339786:
                    if (str.equals("SystemChrome.setEnabledSystemUIMode")) {
                        try {
                            int iV = h3.e.v(eVar, (String) obj);
                            d1.b bVar4 = (d1.b) ((io.flutter.plugin.platform.n) eVar.f20376d).f25711c;
                            if (iV == 1) {
                                i = 1798;
                            } else if (iV == 2) {
                                i = 3846;
                            } else if (iV != 3) {
                                if (iV == 4 && Build.VERSION.SDK_INT >= 29) {
                                    i = 1792;
                                }
                                ((g) pVar).success(null);
                            } else {
                                i = 5894;
                            }
                            bVar4.f15507c = i;
                            bVar4.E();
                            ((g) pVar).success(null);
                        } catch (NoSuchFieldException | JSONException e11) {
                            ((g) pVar).b("error", e11.getMessage(), null);
                            return;
                        }
                    }
                    ((g) pVar).a();
                    break;
                case 1390477857:
                    if (str.equals("SystemChrome.setSystemUIOverlayStyle")) {
                        try {
                            ((d1.b) ((io.flutter.plugin.platform.n) eVar.f20376d).f25711c).z(h3.e.w(eVar, (JSONObject) obj));
                            ((g) pVar).success(null);
                        } catch (NoSuchFieldException | JSONException e12) {
                            ((g) pVar).b("error", e12.getMessage(), null);
                            return;
                        }
                    }
                    ((g) pVar).a();
                    break;
                case 1514180520:
                    if (str.equals("Clipboard.getData")) {
                        String str2 = (String) obj;
                        if (str2 != null) {
                            try {
                                aVarA = hi.a.a(str2);
                            } catch (NoSuchFieldException unused) {
                                ((g) pVar).b("error", "No such clipboard content format: ".concat(str2), null);
                                aVarA = null;
                            }
                        } else {
                            aVarA = null;
                        }
                        CharSequence charSequenceC = ((io.flutter.plugin.platform.n) eVar.f20376d).c(aVarA);
                        if (charSequenceC == null) {
                            ((g) pVar).success(null);
                        } else {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("text", charSequenceC);
                            ((g) pVar).success(jSONObject3);
                        }
                    }
                    ((g) pVar).a();
                    break;
                case 1674312266:
                    if (str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                        try {
                            ((io.flutter.plugin.platform.n) eVar.f20376d).i(h3.e.u(eVar, (JSONArray) obj));
                            ((g) pVar).success(null);
                        } catch (NoSuchFieldException | JSONException e13) {
                            ((g) pVar).b("error", e13.getMessage(), null);
                            return;
                        }
                    }
                    ((g) pVar).a();
                    break;
                case 2119655719:
                    if (str.equals("SystemChrome.setPreferredOrientations")) {
                        try {
                            ((Activity) ((d1.b) ((io.flutter.plugin.platform.n) eVar.f20376d).f25711c).f15508d).setRequestedOrientation(h3.e.t(eVar, (JSONArray) obj));
                            ((g) pVar).success(null);
                        } catch (NoSuchFieldException | JSONException e14) {
                            ((g) pVar).b("error", e14.getMessage(), null);
                            return;
                        }
                    }
                    ((g) pVar).a();
                    break;
                default:
                    ((g) pVar).a();
                    break;
            }
        } catch (JSONException e15) {
            ((g) pVar).b("error", "JSON error: " + e15.getMessage(), null);
        }
    }

    public static String P(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static c u(f messenger, String instanceName) {
        a1.e eVar = new a1.e(6);
        l streamHandler = new l(9, eVar);
        Intrinsics.checkNotNullParameter(messenger, "messenger");
        Intrinsics.checkNotNullParameter(streamHandler, "streamHandler");
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        new ii.i(messenger, instanceName.length() > 0 ? "dev.flutter.pigeon.video_player_android.VideoEventChannel.videoEvents.".concat(instanceName) : "dev.flutter.pigeon.video_player_android.VideoEventChannel.videoEvents", cj.m.f2344a).a(new v7.f(streamHandler));
        return new c(8, eVar);
    }

    public String A(String str) {
        return D(str.concat("_loc_key"));
    }

    public Long B() {
        String strD = D("gcm.n.event_time");
        if (TextUtils.isEmpty(strD)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strD));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + P("gcm.n.event_time") + "(" + strD + ") into a long");
            return null;
        }
    }

    public String C(Resources resources, String str, String str2) {
        String strD = D(str2);
        if (!TextUtils.isEmpty(strD)) {
            return strD;
        }
        String strA = A(str2);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        int identifier = resources.getIdentifier(strA, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", P(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrZ = z(str2);
        if (objArrZ == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrZ);
        } catch (MissingFormatArgumentException e3) {
            Log.w("NotificationParams", "Missing format argument for " + P(str2) + ": " + Arrays.toString(objArrZ) + " Default value will be used.", e3);
            return null;
        }
    }

    public String D(String str) {
        Bundle bundle = (Bundle) this.f16785c;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public long[] E() {
        JSONArray jSONArrayX = x("gcm.n.vibrate_timings");
        if (jSONArrayX == null) {
            return null;
        }
        try {
            if (jSONArrayX.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayX.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayX.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayX + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public void F(int i, long j10) throws d0 {
        i5.e eVar = (i5.e) this.f16785c;
        if (i == 240) {
            if (eVar.f21156z) {
                return;
            }
            eVar.e(i);
            if (eVar.H == -1) {
                eVar.H = j10;
                return;
            }
            return;
        }
        if (i == 241) {
            if (eVar.f21156z) {
                return;
            }
            eVar.e(i);
            if (eVar.G == -1) {
                eVar.G = j10;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j10 == 0) {
                return;
            }
            throw d0.a(null, "ContentEncodingOrder " + j10 + " not supported");
        }
        if (i == 20530) {
            if (j10 == 1) {
                return;
            }
            throw d0.a(null, "ContentEncodingScope " + j10 + " not supported");
        }
        switch (i) {
            case 131:
                int i10 = (int) j10;
                if (i10 == 1) {
                    eVar.f(i);
                    eVar.f21155y.f21097e = 2;
                    return;
                }
                if (i10 == 2) {
                    eVar.f(i);
                    eVar.f21155y.f21097e = 1;
                    return;
                } else if (i10 == 17) {
                    eVar.f(i);
                    eVar.f21155y.f21097e = 3;
                    return;
                } else if (i10 != 33) {
                    eVar.f(i);
                    eVar.f21155y.f21097e = -1;
                    return;
                } else {
                    eVar.f(i);
                    eVar.f21155y.f21097e = 5;
                    return;
                }
            case 136:
                eVar.f(i);
                eVar.f21155y.Y = j10 == 1;
                return;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                eVar.Q = eVar.l(j10);
                return;
            case 159:
                eVar.f(i);
                eVar.f21155y.Q = (int) j10;
                return;
            case 176:
                eVar.f(i);
                eVar.f21155y.f21105n = (int) j10;
                return;
            case 179:
                if (eVar.f21156z) {
                    return;
                }
                eVar.e(i);
                eVar.E = eVar.l(j10);
                return;
            case 186:
                eVar.f(i);
                eVar.f21155y.f21106o = (int) j10;
                return;
            case 215:
                eVar.f(i);
                eVar.f21155y.f21096d = (int) j10;
                return;
            case 231:
                eVar.M = eVar.l(j10);
                return;
            case 238:
                eVar.X = (int) j10;
                return;
            case 247:
                if (eVar.f21156z) {
                    return;
                }
                eVar.e(i);
                eVar.F = (int) j10;
                return;
            case 251:
                eVar.Y = true;
                return;
            case 16871:
                eVar.f(i);
                eVar.f21155y.f21100h = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw d0.a(null, "ContentCompAlgo " + j10 + " not supported");
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw d0.a(null, "DocTypeReadVersion " + j10 + " not supported");
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw d0.a(null, "EBMLReadVersion " + j10 + " not supported");
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw d0.a(null, "ContentEncAlgo " + j10 + " not supported");
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw d0.a(null, "AESSettingsCipherMode " + j10 + " not supported");
            case 21420:
                eVar.B = j10 + eVar.f21149s;
                return;
            case 21432:
                int i11 = (int) j10;
                eVar.f(i);
                if (i11 == 0) {
                    eVar.f21155y.f21116y = 0;
                    return;
                }
                if (i11 == 1) {
                    eVar.f21155y.f21116y = 2;
                    return;
                } else if (i11 == 3) {
                    eVar.f21155y.f21116y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    eVar.f21155y.f21116y = 3;
                    return;
                }
            case 21680:
                eVar.f(i);
                eVar.f21155y.f21108q = (int) j10;
                return;
            case 21682:
                eVar.f(i);
                eVar.f21155y.f21110s = (int) j10;
                return;
            case 21690:
                eVar.f(i);
                eVar.f21155y.f21109r = (int) j10;
                return;
            case 21930:
                eVar.f(i);
                eVar.f21155y.X = j10 == 1;
                return;
            case 21938:
                eVar.f(i);
                d dVar = eVar.f21155y;
                dVar.f21117z = true;
                dVar.f21107p = (int) j10;
                return;
            case 21998:
                eVar.f(i);
                eVar.f21155y.f21099g = (int) j10;
                return;
            case 22186:
                eVar.f(i);
                eVar.f21155y.T = j10;
                return;
            case 22203:
                eVar.f(i);
                eVar.f21155y.U = j10;
                return;
            case 25188:
                eVar.f(i);
                eVar.f21155y.R = (int) j10;
                return;
            case 30114:
                eVar.Z = j10;
                return;
            case 30321:
                eVar.f(i);
                int i12 = (int) j10;
                if (i12 == 0) {
                    eVar.f21155y.f21111t = 0;
                    return;
                }
                if (i12 == 1) {
                    eVar.f21155y.f21111t = 1;
                    return;
                } else if (i12 == 2) {
                    eVar.f21155y.f21111t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    eVar.f21155y.f21111t = 3;
                    return;
                }
            case 2352003:
                eVar.f(i);
                eVar.f21155y.f21098f = (int) j10;
                return;
            case 2807729:
                eVar.f21150t = j10;
                return;
            default:
                switch (i) {
                    case 21945:
                        eVar.f(i);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            eVar.f21155y.C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            eVar.f21155y.C = 1;
                            return;
                        }
                    case 21946:
                        eVar.f(i);
                        int iG = j3.g.g((int) j10);
                        if (iG != -1) {
                            eVar.f21155y.B = iG;
                            return;
                        }
                        return;
                    case 21947:
                        eVar.f(i);
                        eVar.f21155y.f21117z = true;
                        int iF = j3.g.f((int) j10);
                        if (iF != -1) {
                            eVar.f21155y.A = iF;
                            return;
                        }
                        return;
                    case 21948:
                        eVar.f(i);
                        eVar.f21155y.D = (int) j10;
                        return;
                    case 21949:
                        eVar.f(i);
                        eVar.f21155y.E = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    public Bundle J() {
        Bundle bundle = (Bundle) this.f16785c;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public void K(int i, hi.k kVar) {
        io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) this.f16785c;
        iVar.d();
        iVar.f25666f = kVar;
        iVar.f25665e = new c3(2, i);
        iVar.f25668h.e(iVar);
        s7.g gVar = kVar.f20616j;
        iVar.f25668h = new io.flutter.plugin.editing.f(gVar != null ? (hi.m) gVar.f32797d : null, iVar.f25661a);
        iVar.e(kVar);
        iVar.i = true;
        if (iVar.f25665e.f4005a == 3) {
            iVar.f25675p = false;
        }
        iVar.f25672m = null;
        iVar.f25668h.a(iVar);
    }

    public void L(double d10, double d11, double[] dArr) {
        io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) this.f16785c;
        double[] dArr2 = new double[4];
        boolean z5 = dArr[3] == ConfigValue.DOUBLE_DEFAULT_VALUE && dArr[7] == ConfigValue.DOUBLE_DEFAULT_VALUE && dArr[15] == 1.0d;
        double d12 = dArr[12];
        double d13 = dArr[15];
        double d14 = d12 / d13;
        dArr2[1] = d14;
        dArr2[0] = d14;
        double d15 = dArr[13] / d13;
        dArr2[3] = d15;
        dArr2[2] = d15;
        i4 i4Var = new i4();
        i4Var.f13781b = z5;
        i4Var.f13782c = dArr;
        i4Var.f13783d = dArr2;
        i4Var.g(d10, ConfigValue.DOUBLE_DEFAULT_VALUE);
        i4Var.g(d10, d11);
        i4Var.g(ConfigValue.DOUBLE_DEFAULT_VALUE, d11);
        double d16 = iVar.f25661a.getContext().getResources().getDisplayMetrics().density;
        iVar.f25672m = new Rect((int) (dArr2[0] * d16), (int) (dArr2[2] * d16), (int) Math.ceil(dArr2[1] * d16), (int) Math.ceil(dArr2[3] * d16));
    }

    public void M(hi.m mVar) {
        hi.m mVar2;
        int i;
        int i10;
        io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) this.f16785c;
        View view = iVar.f25661a;
        if (!iVar.i && (mVar2 = iVar.f25674o) != null && (i = mVar2.f20626d) >= 0 && (i10 = mVar2.f20627e) > i) {
            int i11 = i10 - i;
            int i12 = mVar.f20627e;
            int i13 = mVar.f20626d;
            boolean z5 = true;
            if (i11 == i12 - i13) {
                int i14 = 0;
                while (true) {
                    if (i14 >= i11) {
                        z5 = false;
                        break;
                    } else if (mVar2.f20623a.charAt(i14 + i) != mVar.f20623a.charAt(i14 + i13)) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            iVar.i = z5;
        }
        iVar.f25674o = mVar;
        iVar.f25668h.f(mVar);
        if (iVar.i) {
            iVar.f25662b.restartInput(view);
            iVar.i = false;
        }
    }

    public void N(int i, long j10, long j11) throws d0 {
        i5.e eVar = (i5.e) this.f16785c;
        eVar.f21140j0.getClass();
        if (i == 160) {
            eVar.Y = false;
            eVar.Z = 0L;
            return;
        }
        if (i == 174) {
            d dVar = new d();
            dVar.f21105n = -1;
            dVar.f21106o = -1;
            dVar.f21107p = -1;
            dVar.f21108q = -1;
            dVar.f21109r = -1;
            dVar.f21110s = 0;
            dVar.f21111t = -1;
            dVar.f21112u = 0.0f;
            dVar.f21113v = 0.0f;
            dVar.f21114w = 0.0f;
            dVar.f21115x = null;
            dVar.f21116y = -1;
            dVar.f21117z = false;
            dVar.A = -1;
            dVar.B = -1;
            dVar.C = -1;
            dVar.D = 1000;
            dVar.E = VKApiCodes.CODE_ACCESS_DENIED_TO_ALBUM;
            dVar.F = -1.0f;
            dVar.G = -1.0f;
            dVar.H = -1.0f;
            dVar.I = -1.0f;
            dVar.J = -1.0f;
            dVar.K = -1.0f;
            dVar.L = -1.0f;
            dVar.M = -1.0f;
            dVar.N = -1.0f;
            dVar.O = -1.0f;
            dVar.Q = 1;
            dVar.R = -1;
            dVar.S = 8000;
            dVar.T = 0L;
            dVar.U = 0L;
            dVar.W = false;
            dVar.Y = true;
            dVar.Z = "eng";
            eVar.f21155y = dVar;
            dVar.f21090a = eVar.f21153w;
            return;
        }
        if (i == 183) {
            if (eVar.f21156z) {
                return;
            }
            eVar.e(i);
            eVar.F = -1;
            eVar.G = -1L;
            eVar.H = -1L;
            return;
        }
        if (i == 187) {
            if (eVar.f21156z) {
                return;
            }
            eVar.e(i);
            eVar.E = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            eVar.A = -1;
            eVar.B = -1L;
            return;
        }
        if (i == 20533) {
            eVar.f(i);
            eVar.f21155y.i = true;
            return;
        }
        if (i == 21968) {
            eVar.f(i);
            eVar.f21155y.f21117z = true;
            return;
        }
        if (i == 408125543) {
            long j12 = eVar.f21149s;
            if (j12 != -1 && j12 != j10) {
                throw d0.a(null, "Multiple Segment elements not supported");
            }
            eVar.f21149s = j10;
            eVar.f21148r = j11;
            return;
        }
        if (i == 475249515) {
            if (eVar.f21156z) {
                return;
            }
            eVar.D = true;
        } else if (i == 524531317 && !eVar.f21156z) {
            if (eVar.f21129d && eVar.K != -1) {
                eVar.J = true;
            } else {
                eVar.f21140j0.j(new q4.o(eVar.f21152v));
                eVar.f21156z = true;
            }
        }
    }

    public void O(int i, String str) throws d0 {
        i5.e eVar = (i5.e) this.f16785c;
        if (i == 134) {
            eVar.f(i);
            eVar.f21155y.f21094c = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                eVar.f21153w = str.equals("webm");
                return;
            }
            throw d0.a(null, "DocType " + str + " not supported");
        }
        if (i == 21358) {
            eVar.f(i);
            eVar.f21155y.f21092b = str;
        } else {
            if (i != 2274716) {
                return;
            }
            eVar.f(i);
            eVar.f21155y.Z = str;
        }
    }

    @Override // b4.n
    public void a(Bundle bundle) {
        ((MediaCodec) this.f16785c).setParameters(bundle);
    }

    @Override // oa.m
    public void accept(Object obj, Object obj2) {
        kb.e eVar = (kb.e) this.f16785c;
        w wVar = (w) ((h) obj).n();
        gb.d dVar = new gb.d(0, (sb.g) obj2);
        Parcel parcelD0 = wVar.D0();
        gb.b.b(parcelD0, eVar);
        parcelD0.writeStrongBinder(dVar);
        parcelD0.writeString(null);
        wVar.T0(parcelD0, 63);
    }

    @Override // k6.r1
    public int b(View view) {
        return ((androidx.recyclerview.widget.i) this.f16785c).getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).topMargin;
    }

    @Override // m.q1
    public void c(l.i iVar, MenuItem menuItem) {
        ((l.f) this.f16785c).f27602g.removeCallbacksAndMessages(iVar);
    }

    @Override // b4.n
    public void d(int i, cp1 cp1Var, long j10, int i10) {
        ((MediaCodec) this.f16785c).queueSecureInputBuffer(i, 0, cp1Var.i, j10, i10);
    }

    @Override // f.b
    public void e(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f16785c;
        f.a aVar = (f.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f16448c;
        int i = o1.d(intent, "ProxyBillingActivityV2").f15636a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f2424f;
        if (resultReceiver != null) {
            resultReceiver.send(i, intent == null ? null : intent.getExtras());
        }
        int i10 = aVar.f16447b;
        if (i10 != -1 || i != 0) {
            o1.g("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i10 + " and billing's responseCode: " + i);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // b4.n
    public void f(int i, int i10, long j10, int i11) {
        ((MediaCodec) this.f16785c).queueInputBuffer(i, 0, i10, j10, i11);
    }

    @Override // k6.r1
    public int g() {
        return ((androidx.recyclerview.widget.i) this.f16785c).getPaddingTop();
    }

    @Override // com.google.android.gms.internal.ads.k81
    /* JADX INFO: renamed from: i */
    public void mo6i(Object obj) {
        u9.i.c("Initialized webview successfully for SDKCore.");
        if (((Boolean) s.f31967e.f31970c.a(al.Va)).booleanValue()) {
            aa.l lVar = (aa.l) this.f16785c;
            hl.l.z(lVar.f631m, "sgs", new Pair("se", "query_g"), new Pair("ad_format", "BANNER"), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(lVar.E.get())));
            lVar.D.set(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.k81
    public void k(Throwable th2) {
        p9.k.C.f31302h.d("SignalGeneratorImpl.initializeWebViewForSignalCollection", th2);
        Pair pair = new Pair("sgf_reason", th2.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", "BANNER");
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        aa.l lVar = (aa.l) this.f16785c;
        hl.l.z(lVar.f631m, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(lVar.E.get())));
        u9.i.f("Failed to initialize webview for loading SDKCore. ", th2);
        wk wkVar = al.Va;
        s sVar = s.f31967e;
        if (!((Boolean) sVar.f31970c.a(wkVar)).booleanValue() || lVar.D.get()) {
            return;
        }
        if (lVar.E.getAndIncrement() < ((Integer) sVar.f31970c.a(al.Wa)).intValue()) {
            lVar.o4();
        }
    }

    @Override // m.q1
    public void l(l.i iVar, j jVar) {
        l.f fVar = (l.f) this.f16785c;
        Handler handler = fVar.f27602g;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (iVar == ((l.e) arrayList.get(i)).f27596b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i10 = i + 1;
        handler.postAtTime(new aa.b(this, i10 < arrayList.size() ? (l.e) arrayList.get(i10) : null, jVar, iVar, 7, false), iVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // j1.i
    public Object m(j1.h hVar) {
        k0.d dVar = (k0.d) this.f16785c;
        f2.g.h("The result can only set once!", dVar.f26764c == null);
        dVar.f26764c = hVar;
        return "FutureChain[" + dVar + "]";
    }

    @Override // cf.c
    public void n(Object obj, String str) {
        ((p) this.f16785c).b("sqlite_error", str, obj);
    }

    @Override // k6.r1
    public int o() {
        androidx.recyclerview.widget.i iVar = (androidx.recyclerview.widget.i) this.f16785c;
        return iVar.getHeight() - iVar.getPaddingBottom();
    }

    @Override // com.yandex.varioqub.config.OnFetchCompleteListener
    public void onError(String str, FetchError fetchError) {
        long j10;
        switch (ih.a.f21302a[fetchError.ordinal()]) {
            case 1:
                j10 = 1;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                j10 = 2;
                break;
            default:
                Log.e("VarioqubFlutter", "Unknown fetch error: " + fetchError);
                j10 = -1;
                break;
        }
        jh.b bVar = (jh.b) this.f16785c;
        Long lValueOf = Long.valueOf(j10);
        String strName = fetchError.name();
        jh.a aVar = new jh.a();
        aVar.f26622a = strName;
        aVar.f26623b = lValueOf;
        ArrayList arrayList = bVar.f26625b;
        arrayList.add(0, aVar);
        bVar.f26626c.i(arrayList);
    }

    @Override // k0.c
    public void onFailure(Throwable th2) {
        switch (this.f16784b) {
            case 1:
                break;
            default:
                c0 c0Var = (c0) ((v7.f) this.f16785c).f34767c;
                if (!(th2 instanceof MediaCodec.CodecException)) {
                    c0Var.b(th2.getMessage(), th2, 0);
                } else {
                    MediaCodec.CodecException codecException = (MediaCodec.CodecException) th2;
                    c0Var.b(codecException.getMessage(), codecException, 1);
                }
                break;
        }
    }

    @Override // ii.o
    public void onMethodCall(ii.n nVar, p pVar) {
        Object obj;
        int i;
        int i10;
        int i11;
        Bundle bundle;
        int i12 = 1;
        switch (this.f16784b) {
            case 17:
                h3.e eVar = (h3.e) this.f16785c;
                if (((l) eVar.f20376d) != null) {
                    if (!nVar.f21315a.equals("Localization.getStringResource")) {
                        ((g) pVar).a();
                    } else {
                        JSONObject jSONObject = (JSONObject) nVar.f21316b;
                        try {
                            ((g) pVar).success(((l) eVar.f20376d).h(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                        } catch (JSONException e3) {
                            ((g) pVar).b("error", e3.getMessage(), null);
                            return;
                        }
                    }
                    break;
                }
                break;
            case 18:
                I(nVar, pVar);
                break;
            case 19:
                hi.h hVar = (hi.h) this.f16785c;
                String str = nVar.f21315a;
                Object obj2 = nVar.f21316b;
                if (str.equals("get")) {
                    hVar.f20599d = true;
                    if (!hVar.f20598c && hVar.f20597b) {
                        hVar.f20602g = (g) pVar;
                    } else {
                        ((g) pVar).success(hi.h.b((byte[]) hVar.f20600e));
                    }
                } else if (!str.equals("put")) {
                    ((g) pVar).a();
                } else {
                    hVar.f20600e = (byte[]) obj2;
                    ((g) pVar).success(null);
                }
                break;
            default:
                h3.e eVar2 = (h3.e) this.f16785c;
                c cVar = (c) eVar2.f20376d;
                if (cVar != null) {
                    String str2 = nVar.f21315a;
                    obj = nVar.f21316b;
                    i = 0;
                    i10 = 3;
                    i11 = 4;
                    switch (str2) {
                        case "TextInput.setPlatformViewClient":
                            try {
                                JSONObject jSONObject2 = (JSONObject) obj;
                                int i13 = jSONObject2.getInt("platformViewId");
                                boolean zOptBoolean = jSONObject2.optBoolean("usesVirtualDisplay", false);
                                io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) ((c) eVar2.f20376d).f16785c;
                                View view = iVar.f25661a;
                                if (zOptBoolean) {
                                    view.requestFocus();
                                    iVar.f25665e = new c3(i10, i13);
                                    iVar.f25662b.restartInput(view);
                                    iVar.i = false;
                                } else {
                                    iVar.f25665e = new c3(i11, i13);
                                    iVar.f25669j = null;
                                }
                                ((g) pVar).success(null);
                                break;
                            } catch (JSONException e7) {
                                ((g) pVar).b("error", e7.getMessage(), null);
                            }
                            break;
                        case "TextInput.setEditingState":
                            try {
                                cVar.M(hi.m.a((JSONObject) obj));
                                ((g) pVar).success(null);
                                break;
                            } catch (JSONException e10) {
                                ((g) pVar).b("error", e10.getMessage(), null);
                                return;
                            }
                            break;
                        case "TextInput.setClient":
                            try {
                                JSONArray jSONArray = (JSONArray) obj;
                                ((c) eVar2.f20376d).K(jSONArray.getInt(0), hi.k.a(jSONArray.getJSONObject(1)));
                                ((g) pVar).success(null);
                                break;
                            } catch (NoSuchFieldException | JSONException e11) {
                                ((g) pVar).b("error", e11.getMessage(), null);
                                return;
                            }
                            break;
                        case "TextInput.hide":
                            io.flutter.plugin.editing.i iVar2 = (io.flutter.plugin.editing.i) cVar.f16785c;
                            if (iVar2.f25665e.f4005a == 4) {
                                iVar2.d();
                            } else {
                                View view2 = iVar2.f25661a;
                                iVar2.d();
                                iVar2.f25662b.hideSoftInputFromWindow(view2.getApplicationWindowToken(), 0);
                            }
                            ((g) pVar).success(null);
                            break;
                        case "TextInput.show":
                            io.flutter.plugin.editing.i iVar3 = (io.flutter.plugin.editing.i) cVar.f16785c;
                            InputMethodManager inputMethodManager = iVar3.f25662b;
                            View view3 = iVar3.f25661a;
                            hi.k kVar = iVar3.f25666f;
                            if (kVar == null || kVar.f20614g.f20620a != 11) {
                                view3.requestFocus();
                                inputMethodManager.showSoftInput(view3, 0);
                            } else {
                                iVar3.d();
                                inputMethodManager.hideSoftInputFromWindow(view3.getApplicationWindowToken(), 0);
                            }
                            ((g) pVar).success(null);
                            break;
                        case "TextInput.sendAppPrivateCommand":
                            try {
                                JSONObject jSONObject3 = (JSONObject) obj;
                                String string = jSONObject3.getString("action");
                                String string2 = jSONObject3.getString("data");
                                if (string2 == null || string2.isEmpty()) {
                                    bundle = null;
                                } else {
                                    bundle = new Bundle();
                                    bundle.putString("data", string2);
                                }
                                io.flutter.plugin.editing.i iVar4 = (io.flutter.plugin.editing.i) ((c) eVar2.f20376d).f16785c;
                                iVar4.f25662b.sendAppPrivateCommand(iVar4.f25661a, string, bundle);
                                ((g) pVar).success(null);
                                break;
                            } catch (JSONException e12) {
                                ((g) pVar).b("error", e12.getMessage(), null);
                                return;
                            }
                            break;
                        case "TextInput.setEditableSizeAndTransform":
                            try {
                                JSONObject jSONObject4 = (JSONObject) obj;
                                double d10 = jSONObject4.getDouble("width");
                                double d11 = jSONObject4.getDouble("height");
                                JSONArray jSONArray2 = jSONObject4.getJSONArray("transform");
                                double[] dArr = new double[16];
                                while (i < 16) {
                                    dArr[i] = jSONArray2.getDouble(i);
                                    i++;
                                }
                                ((c) eVar2.f20376d).L(d10, d11, dArr);
                                ((g) pVar).success(null);
                                break;
                            } catch (JSONException e13) {
                                ((g) pVar).b("error", e13.getMessage(), null);
                                return;
                            }
                            break;
                        case "TextInput.finishAutofillContext":
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            if (Build.VERSION.SDK_INT >= 26) {
                                AutofillManager autofillManager = ((io.flutter.plugin.editing.i) cVar.f16785c).f25663c;
                                if (autofillManager != null) {
                                    if (zBooleanValue) {
                                        autofillManager.commit();
                                    } else {
                                        autofillManager.cancel();
                                    }
                                }
                            } else {
                                cVar.getClass();
                            }
                            ((g) pVar).success(null);
                            break;
                        case "TextInput.clearClient":
                            io.flutter.plugin.editing.i iVar5 = (io.flutter.plugin.editing.i) cVar.f16785c;
                            View view4 = iVar5.f25661a;
                            if (iVar5.f25665e.f4005a != 3) {
                                iVar5.f25668h.e(iVar5);
                                iVar5.d();
                                iVar5.f25666f = null;
                                iVar5.e(null);
                                iVar5.f25665e = new c3(i12, i);
                                iVar5.f25672m = null;
                                Field field = n0.f19900a;
                                x1 x1VarA = g0.a(view4);
                                if (x1VarA != null && !x1VarA.f19943a.s(8)) {
                                    iVar5.f25662b.restartInput(view4);
                                }
                            }
                            ((g) pVar).success(null);
                            break;
                        case "TextInput.requestAutofill":
                            io.flutter.plugin.editing.i iVar6 = (io.flutter.plugin.editing.i) cVar.f16785c;
                            View view5 = iVar6.f25661a;
                            if (Build.VERSION.SDK_INT >= 26 && iVar6.f25663c != null && iVar6.f25667g != null) {
                                String str3 = (String) iVar6.f25666f.f20616j.f32795b;
                                int[] iArr = new int[2];
                                view5.getLocationOnScreen(iArr);
                                Rect rect = new Rect(iVar6.f25672m);
                                rect.offset(iArr[0], iArr[1]);
                                iVar6.f25663c.notifyViewEntered(view5, str3.hashCode(), rect);
                            }
                            ((g) pVar).success(null);
                            break;
                        default:
                            ((g) pVar).a();
                            break;
                    }
                }
                break;
        }
    }

    @Override // com.yandex.varioqub.config.OnFetchCompleteListener
    public void onSuccess() {
        jh.b bVar = (jh.b) this.f16785c;
        jh.a aVar = new jh.a();
        aVar.f26622a = null;
        aVar.f26623b = 0L;
        ArrayList arrayList = bVar.f26625b;
        arrayList.add(0, aVar);
        bVar.f26626c.i(arrayList);
    }

    @Override // kk.e
    public Object p(kk.f fVar, mj.a aVar) {
        Object objP = ((e) this.f16785c).p(new aj.w(fVar, 0), aVar);
        return objP == nj.a.f29512b ? objP : Unit.f27471a;
    }

    @Override // ii.b
    public void q(Object obj, h3.e eVar) {
        HashMap map;
        HashMap map2;
        ka.k kVar = (ka.k) this.f16785c;
        if (((io.flutter.view.b) kVar.f27326e) == null) {
            eVar.i(null);
            return;
        }
        map = (HashMap) obj;
        String str = (String) map.get("type");
        map2 = (HashMap) map.get("data");
        str.getClass();
        switch (str) {
            case "tooltip":
                String str2 = (String) map2.get("message");
                if (str2 != null) {
                    io.flutter.view.h hVar = (io.flutter.view.h) ((io.flutter.view.b) kVar.f27326e).f25784a;
                    if (Build.VERSION.SDK_INT < 28) {
                        AccessibilityEvent accessibilityEventE = hVar.e(0, 32);
                        accessibilityEventE.getText().add(str2);
                        hVar.i(accessibilityEventE);
                    }
                    break;
                }
                break;
            case "announce":
                String str3 = (String) map2.get("message");
                if (str3 != null) {
                    io.flutter.view.b bVar = (io.flutter.view.b) kVar.f27326e;
                    if (Build.VERSION.SDK_INT >= 36) {
                        bVar.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.h) bVar.f25784a).f25846a.announceForAccessibility(str3);
                    break;
                }
                break;
            case "tap":
                Integer num = (Integer) map.get("nodeId");
                if (num != null) {
                    io.flutter.view.b bVar2 = (io.flutter.view.b) kVar.f27326e;
                    ((io.flutter.view.h) bVar2.f25784a).h(num.intValue(), 1);
                    break;
                }
                break;
            case "focus":
                Integer num2 = (Integer) map.get("nodeId");
                if (num2 != null) {
                    io.flutter.view.b bVar3 = (io.flutter.view.b) kVar.f27326e;
                    ((io.flutter.view.h) bVar3.f25784a).h(num2.intValue(), 8);
                    break;
                }
                break;
            case "longPress":
                Integer num3 = (Integer) map.get("nodeId");
                if (num3 != null) {
                    io.flutter.view.b bVar4 = (io.flutter.view.b) kVar.f27326e;
                    ((io.flutter.view.h) bVar4.f25784a).h(num3.intValue(), 2);
                    break;
                }
                break;
        }
        eVar.i(null);
    }

    @Override // k6.r1
    public View r(int i) {
        return ((androidx.recyclerview.widget.i) this.f16785c).getChildAt(i);
    }

    @Override // k6.r1
    public int s(View view) {
        return ((androidx.recyclerview.widget.i) this.f16785c).getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).bottomMargin;
    }

    @Override // cf.c
    public void success(Object obj) {
        ((p) this.f16785c).success(obj);
    }

    public void t(int i, int i10, q4.l lVar) throws d0 {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        int i16;
        int i17;
        int i18;
        int i19;
        i5.e eVar = (i5.e) this.f16785c;
        i5.f fVar = eVar.f21125b;
        SparseArray sparseArray = eVar.f21127c;
        m3.p pVar = eVar.f21141k;
        m3.p pVar2 = eVar.i;
        int i20 = 2;
        int i21 = 0;
        int i22 = 1;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (eVar.O != 2) {
                    return;
                }
                d dVar = (d) sparseArray.get(eVar.U);
                int i23 = eVar.X;
                m3.p pVar3 = eVar.f21146p;
                if (i23 != 4 || !"V_VP9".equals(dVar.f21094c)) {
                    lVar.M(i10);
                    return;
                } else {
                    pVar3.J(i10);
                    lVar.readFully(pVar3.f28589a, 0, i10);
                    return;
                }
            }
            if (i == 16877) {
                eVar.f(i);
                d dVar2 = eVar.f21155y;
                int i24 = dVar2.f21100h;
                if (i24 != 1685485123 && i24 != 1685480259) {
                    lVar.M(i10);
                    return;
                }
                byte[] bArr = new byte[i10];
                dVar2.P = bArr;
                lVar.readFully(bArr, 0, i10);
                return;
            }
            if (i == 16981) {
                eVar.f(i);
                byte[] bArr2 = new byte[i10];
                eVar.f21155y.f21101j = bArr2;
                lVar.readFully(bArr2, 0, i10);
                return;
            }
            if (i == 18402) {
                byte[] bArr3 = new byte[i10];
                lVar.readFully(bArr3, 0, i10);
                eVar.f(i);
                eVar.f21155y.f21102k = new z(1, 0, 0, bArr3);
                return;
            }
            if (i == 21419) {
                Arrays.fill(pVar.f28589a, (byte) 0);
                lVar.readFully(pVar.f28589a, 4 - i10, i10);
                pVar.M(0);
                eVar.A = (int) pVar.B();
                return;
            }
            if (i == 25506) {
                eVar.f(i);
                byte[] bArr4 = new byte[i10];
                eVar.f21155y.f21103l = bArr4;
                lVar.readFully(bArr4, 0, i10);
                return;
            }
            if (i != 30322) {
                throw d0.a(null, "Unexpected id: " + i);
            }
            eVar.f(i);
            byte[] bArr5 = new byte[i10];
            eVar.f21155y.f21115x = bArr5;
            lVar.readFully(bArr5, 0, i10);
            return;
        }
        if (eVar.O == 0) {
            eVar.U = (int) fVar.b(lVar, false, true, 8);
            eVar.V = fVar.f21160c;
            eVar.Q = -9223372036854775807L;
            eVar.O = 1;
            pVar2.J(0);
        }
        d dVar3 = (d) sparseArray.get(eVar.U);
        if (dVar3 == null) {
            lVar.M(i10 - eVar.V);
            eVar.O = 0;
            return;
        }
        dVar3.f21091a0.getClass();
        if (eVar.O == 1) {
            eVar.j(lVar, 3);
            int i25 = (pVar2.f28589a[2] & 6) >> 1;
            byte b2 = 255;
            if (i25 == 0) {
                eVar.S = 1;
                int[] iArr = eVar.T;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                eVar.T = iArr;
                iArr[0] = (i10 - eVar.V) - 3;
            } else {
                eVar.j(lVar, 4);
                int i26 = (pVar2.f28589a[3] & KotlinVersion.MAX_COMPONENT_VALUE) + 1;
                eVar.S = i26;
                int[] iArr2 = eVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[i26];
                } else if (iArr2.length < i26) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i26)];
                }
                eVar.T = iArr2;
                if (i25 == 2) {
                    int i27 = (i10 - eVar.V) - 4;
                    int i28 = eVar.S;
                    Arrays.fill(iArr2, 0, i28, i27 / i28);
                } else {
                    if (i25 != 1) {
                        if (i25 != 3) {
                            throw d0.a(null, "Unexpected lacing value: " + i25);
                        }
                        int i29 = 0;
                        int i30 = 0;
                        int i31 = 4;
                        while (true) {
                            int i32 = eVar.S - i22;
                            if (i29 >= i32) {
                                i11 = i20;
                                i12 = i21;
                                i13 = i22;
                                eVar.T[i32] = ((i10 - eVar.V) - i31) - i30;
                                break;
                            }
                            eVar.T[i29] = i21;
                            int i33 = i31 + 1;
                            eVar.j(lVar, i33);
                            if (pVar2.f28589a[i31] == 0) {
                                throw d0.a(null, "No valid varint length mask found");
                            }
                            int i34 = i21;
                            while (true) {
                                if (i34 >= 8) {
                                    i14 = i20;
                                    i15 = i22;
                                    j10 = 0;
                                    i16 = i33;
                                    break;
                                }
                                int i35 = i22 << (7 - i34);
                                i14 = i20;
                                if ((pVar2.f28589a[i31] & i35) != 0) {
                                    int i36 = i33 + i34;
                                    eVar.j(lVar, i36);
                                    i15 = i22;
                                    j10 = pVar2.f28589a[i31] & b2 & (~i35);
                                    while (i33 < i36) {
                                        j10 = (j10 << 8) | ((long) (pVar2.f28589a[i33] & b2));
                                        i33++;
                                        i36 = i36;
                                        b2 = 255;
                                    }
                                    i16 = i36;
                                    if (i29 > 0) {
                                        j10 -= (1 << ((i34 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i34++;
                                    i20 = i14;
                                    b2 = 255;
                                }
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int i37 = (int) j10;
                            int[] iArr3 = eVar.T;
                            if (i29 != 0) {
                                i37 += iArr3[i29 - 1];
                            }
                            iArr3[i29] = i37;
                            i30 += i37;
                            i29++;
                            i21 = i34;
                            i20 = i14;
                            i22 = i15;
                            i31 = i16;
                            b2 = 255;
                        }
                        throw d0.a(null, "EBML lacing sample size out of range.");
                    }
                    int i38 = 0;
                    int i39 = 0;
                    int i40 = 4;
                    while (true) {
                        i17 = eVar.S - 1;
                        if (i38 >= i17) {
                            break;
                        }
                        eVar.T[i38] = 0;
                        while (true) {
                            i18 = i40 + 1;
                            eVar.j(lVar, i18);
                            int i41 = pVar2.f28589a[i40] & 255;
                            int[] iArr4 = eVar.T;
                            i19 = iArr4[i38] + i41;
                            iArr4[i38] = i19;
                            if (i41 != 255) {
                                break;
                            } else {
                                i40 = i18;
                            }
                        }
                        i39 += i19;
                        i38++;
                        i40 = i18;
                    }
                    eVar.T[i17] = ((i10 - eVar.V) - i40) - i39;
                }
            }
            i11 = 2;
            i12 = 0;
            i13 = 1;
            byte[] bArr6 = pVar2.f28589a;
            eVar.P = eVar.l((bArr6[i13] & 255) | (bArr6[i12] << 8)) + eVar.M;
            eVar.W = (dVar3.f21097e == i13 || (i == 163 && (pVar2.f28589a[i11] & 128) == 128)) ? 1 : i12;
            eVar.O = i11;
            eVar.R = i12;
        }
        if (i == 163) {
            while (true) {
                int i42 = eVar.R;
                if (i42 >= eVar.S) {
                    eVar.O = 0;
                    return;
                } else {
                    eVar.g(dVar3, ((long) ((eVar.R * dVar3.f21098f) / 1000)) + eVar.P, eVar.W, eVar.m(lVar, dVar3, eVar.T[i42], false), 0);
                    eVar.R++;
                }
            }
        } else {
            while (true) {
                int i43 = eVar.R;
                if (i43 >= eVar.S) {
                    return;
                }
                int[] iArr5 = eVar.T;
                iArr5[i43] = eVar.m(lVar, dVar3, iArr5[i43], true);
                eVar.R++;
            }
        }
    }

    public boolean v(String str) {
        String strD = D(str);
        return "1".equals(strD) || Boolean.parseBoolean(strD);
    }

    public Integer w(String str) {
        String strD = D(str);
        if (TextUtils.isEmpty(strD)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strD));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + P(str) + "(" + strD + ") into an int");
            return null;
        }
    }

    public JSONArray x(String str) {
        String strD = D(str);
        if (TextUtils.isEmpty(strD)) {
            return null;
        }
        try {
            return new JSONArray(strD);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + P(str) + ": " + strD + ", falling back to default");
            return null;
        }
    }

    public int[] y() {
        JSONArray jSONArrayX = x("gcm.n.light_settings");
        if (jSONArrayX == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayX.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayX.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayX.optInt(1);
            iArr[2] = jSONArrayX.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e3) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayX + ". " + e3.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + jSONArrayX + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Object[] z(String str) {
        JSONArray jSONArrayX = x(str.concat("_loc_args"));
        if (jSONArrayX == null) {
            return null;
        }
        int length = jSONArrayX.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayX.optString(i);
        }
        return strArr;
    }

    public /* synthetic */ c(int i, Object obj) {
        this.f16784b = i;
        this.f16785c = obj;
    }

    public /* synthetic */ c(l lVar) {
        this.f16784b = 10;
        this.f16785c = (com.google.android.gms.internal.play_billing.c0) lVar.f491c;
    }

    public c() {
        this.f16784b = 0;
        this.f16785c = new HashSet();
    }

    public c(Bundle bundle) {
        this.f16784b = 9;
        if (bundle != null) {
            this.f16785c = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    @Override // k0.c
    public void onSuccess(Object obj) {
        switch (this.f16784b) {
            case 1:
                ((q0.h) this.f16785c).run();
                break;
            default:
                break;
        }
    }

    public c(zh.b bVar) {
        this.f16784b = 20;
        new q(bVar, "flutter/sensitivecontent", x.f21321b, null).b(new l(21, this));
    }

    public c(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.f16784b = 26;
        this.f16785c = uuid;
    }

    @Override // b4.n
    public void flush() {
    }

    @Override // b4.n
    public void h() {
    }

    @Override // b4.n
    public void shutdown() {
    }

    @Override // b4.n
    public void start() {
    }

    private final void H(Throwable th2) {
    }
}
