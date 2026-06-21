package la;

import a0.r1;
import a1.n;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.util.Range;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.kw0;
import com.google.android.gms.internal.ads.om1;
import com.google.android.gms.internal.ads.sz;
import com.google.android.gms.internal.measurement.h5;
import com.google.android.gms.internal.play_billing.o1;
import d8.i0;
import d8.n0;
import d8.x;
import e4.a0;
import e4.z;
import g0.s2;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j3.d0;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import m.h3;
import org.json.JSONException;
import org.json.JSONObject;
import pa.c0;
import q9.x1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public class m implements f2.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static m f28095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static HandlerThread f28096h;
    public static Handler i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f28099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f28100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f28101f;

    public m(int i10, byte b2) {
        this.f28097b = i10;
        switch (i10) {
            case 7:
                this.f28099d = new Object();
                this.f28100e = null;
                this.f28101f = null;
                this.f28098c = 0;
                break;
            case 10:
                this.f28099d = null;
                this.f28100e = null;
                this.f28098c = 0;
                this.f28101f = new Object();
                break;
        }
    }

    public static void a(SparseIntArray sparseIntArray, long j10) {
        if (sparseIntArray != null) {
            int i10 = (int) ((500000 + j10) / 1000000);
            if (j10 >= 0) {
                sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
            }
        }
    }

    public static synchronized m l(Context context) {
        try {
            if (f28095g == null) {
                f28095g = new m(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new x("MessengerIpcClient", 2))));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f28095g;
    }

    public Object b() {
        Object objRemoveLast;
        synchronized (this.f28100e) {
            objRemoveLast = ((ArrayDeque) this.f28099d).removeLast();
        }
        return objRemoveLast;
    }

    public void c(Object obj) throws Exception {
        Object objB;
        synchronized (this.f28100e) {
            try {
                objB = ((ArrayDeque) this.f28099d).size() >= this.f28098c ? b() : null;
                ((ArrayDeque) this.f28099d).addFirst(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (((qg.a) this.f28101f) == null || objB == null) {
            return;
        }
        ((r1) objB).close();
    }

    public String d(d8.a aVar, Uri uri, int i10) throws d0 {
        String str = (String) this.f28101f;
        String str2 = (String) this.f28099d;
        String str3 = (String) this.f28100e;
        int i11 = this.f28098c;
        if (i11 == 1) {
            String strEncodeToString = Base64.encodeToString((aVar.f15576b + StringUtils.PROCESS_POSTFIX_DELIMITER + aVar.f15577c).getBytes(z.f16219h), 0);
            String str4 = m3.z.f28608a;
            Locale locale = Locale.US;
            return om1.k("Basic ", strEncodeToString);
        }
        if (i11 != 2) {
            throw new d0(null, new UnsupportedOperationException(), false, 4);
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String strG = a0.g(i10);
            String str5 = aVar.f15576b + StringUtils.PROCESS_POSTFIX_DELIMITER + str2 + StringUtils.PROCESS_POSTFIX_DELIMITER + aVar.f15577c;
            Charset charset = z.f16219h;
            String strY = m3.z.Y(messageDigest.digest((m3.z.Y(messageDigest.digest(str5.getBytes(charset))) + StringUtils.PROCESS_POSTFIX_DELIMITER + str3 + StringUtils.PROCESS_POSTFIX_DELIMITER + m3.z.Y(messageDigest.digest((strG + StringUtils.PROCESS_POSTFIX_DELIMITER + uri).getBytes(charset)))).getBytes(charset)));
            if (str.isEmpty()) {
                return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", aVar.f15576b, str2, str3, uri, strY);
            }
            return String.format(Locale.US, "Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", aVar.f15576b, str2, str3, uri, strY, str);
        } catch (NoSuchAlgorithmException e3) {
            throw new d0(null, e3, false, 4);
        }
    }

    public int e() {
        return this.f28098c;
    }

    public int f() {
        int i10 = this.f28098c;
        if (i10 != 2) {
            return i10 != 3 ? 0 : 512;
        }
        return 2048;
    }

    public boolean g() {
        boolean zIsEmpty;
        synchronized (this.f28100e) {
            zIsEmpty = ((ArrayDeque) this.f28099d).isEmpty();
        }
        return zIsEmpty;
    }

    @Override // f2.f
    public Object get() {
        Range range = ((x0.a) this.f28100e).f35501a;
        com.google.android.gms.internal.auth.g.e("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        n nVar = (n) this.f28101f;
        int iB = hl.d.B(156000, nVar.f371d, 2, nVar.f370c, 48000, range);
        h3 h3Var = new h3();
        h3Var.f28251c = -1;
        h3Var.f28250b = (String) this.f28099d;
        h3Var.f28251c = Integer.valueOf(this.f28098c);
        h3Var.f28252d = s2.f19753b;
        h3Var.f28256h = Integer.valueOf(nVar.f371d);
        h3Var.f28254f = Integer.valueOf(nVar.f369b);
        h3Var.f28255g = Integer.valueOf(nVar.f370c);
        h3Var.f28253e = Integer.valueOf(iB);
        return h3Var.c();
    }

    public void h() {
        HandlerThread handlerThread;
        synchronized (this.f28099d) {
            try {
                h5.r(this.f28098c > 0);
                int i10 = this.f28098c - 1;
                this.f28098c = i10;
                if (i10 == 0 && (handlerThread = (HandlerThread) this.f28101f) != null) {
                    handlerThread.quit();
                    this.f28101f = null;
                    this.f28100e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Looper i() {
        Looper looper;
        Object obj = this.f28101f;
        synchronized (obj) {
            try {
                if (this.f28098c != 0) {
                    c0.j((HandlerThread) this.f28099d, "Invalid state: handlerThread should already been initialized.");
                } else if (((HandlerThread) this.f28099d) == null) {
                    t9.c0.m("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f28099d = handlerThread;
                    handlerThread.start();
                    this.f28100e = new kw0(((HandlerThread) this.f28099d).getLooper(), 0);
                    t9.c0.m("Looper thread started.");
                } else {
                    t9.c0.m("Resuming the looper thread");
                    obj.notifyAll();
                }
                this.f28098c++;
                looper = ((HandlerThread) this.f28099d).getLooper();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public x1 j() {
        x1 x1Var;
        m mVar = (m) this.f28101f;
        if (mVar == null) {
            x1Var = null;
        } else {
            x1Var = new x1(mVar.f28098c, (String) mVar.f28099d, (String) mVar.f28100e, null, null);
        }
        return new x1(this.f28098c, (String) this.f28099d, (String) this.f28100e, x1Var, null);
    }

    public void k(Throwable th2) {
        i0 i0Var = (i0) this.f28101f;
        if (th2 instanceof TimeoutException) {
            i0Var.Q(114, 28, n0.E);
            o1.h("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            i0Var.Q(107, 28, n0.E);
            o1.h("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.f28100e).run();
    }

    public JSONObject m() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f28098c);
        jSONObject.put("Message", (String) this.f28099d);
        jSONObject.put("Domain", (String) this.f28100e);
        m mVar = (m) this.f28101f;
        if (mVar == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", mVar.m());
        return jSONObject;
    }

    public synchronized sb.m n(l lVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(lVar.toString()));
            }
            if (!((k) this.f28101f).d(lVar)) {
                k kVar = new k(this);
                this.f28101f = kVar;
                kVar.d(lVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return lVar.f28091b.f32858a;
    }

    public String toString() {
        switch (this.f28097b) {
            case 4:
                try {
                    return m().toString(2);
                } catch (JSONException unused) {
                    return "Error forming toString output.";
                }
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m(int i10, String str, String str2, Object obj, int i11) {
        this.f28097b = i11;
        this.f28098c = i10;
        this.f28099d = str;
        this.f28100e = str2;
        this.f28101f = obj;
    }

    public m(i0 i0Var, int i10, Consumer consumer, Runnable runnable) {
        this.f28097b = 2;
        this.f28098c = i10;
        this.f28099d = consumer;
        this.f28100e = runnable;
        this.f28101f = i0Var;
    }

    public m(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f28097b = 0;
        this.f28101f = new k(this);
        this.f28098c = 1;
        this.f28100e = scheduledExecutorService;
        this.f28099d = context.getApplicationContext();
    }

    public m(sz szVar) throws s9.g {
        this.f28097b = 8;
        this.f28100e = szVar.getLayoutParams();
        ViewParent parent = szVar.getParent();
        this.f28099d = szVar.o0();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.f28101f = viewGroup;
            this.f28098c = viewGroup.indexOfChild(szVar.i0());
            viewGroup.removeView(szVar.i0());
            szVar.q1(true);
            return;
        }
        throw new s9.g("Could not get the parent of the WebView for an overlay.");
    }

    public m(int i10, qg.a aVar) {
        this.f28097b = 6;
        this.f28100e = new Object();
        this.f28098c = i10;
        this.f28099d = new ArrayDeque(i10);
        this.f28101f = aVar;
    }

    public m(String str, int i10, x0.a aVar, n nVar) {
        this.f28097b = 1;
        this.f28099d = str;
        this.f28098c = i10;
        this.f28100e = aVar;
        this.f28101f = nVar;
    }

    public m(int i10, String str, int i11, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f28097b = 11;
        this.f28099d = str;
        this.f28098c = i11;
        if (arrayList == null) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f28100e = listUnmodifiableList;
        this.f28101f = bArr;
    }

    public m(int i10) {
        this.f28097b = 9;
        this.f28099d = new SparseIntArray[9];
        this.f28100e = new ArrayList();
        this.f28101f = new t1.e(this);
        this.f28098c = i10;
    }
}
