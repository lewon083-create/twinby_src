package yads;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zl.c1;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class xx0 implements pn0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final nn0 f44834d = new c1(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f44835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediaDrm f44836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f44837c;

    public xx0(UUID uuid) {
        ni.a(uuid);
        ni.a("Use C.CLEARKEY_UUID instead", !jr.f39933b.equals(uuid));
        this.f44835a = uuid;
        MediaDrm mediaDrm = new MediaDrm(a(uuid));
        this.f44836b = mediaDrm;
        this.f44837c = 1;
        if (jr.f39935d.equals(uuid) && d()) {
            a(mediaDrm);
        }
    }

    public static void a(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    @Override // yads.pn0
    public final int b() {
        return 2;
    }

    @Override // yads.pn0
    public final byte[] c() {
        return this.f44836b.openSession();
    }

    @Override // yads.pn0
    public final k20 d(byte[] bArr) {
        return new vx0(a(this.f44835a), bArr, lb3.f40466a < 21 && jr.f39935d.equals(this.f44835a) && "L3".equals(this.f44836b.getPropertyString("securityLevel")));
    }

    @Override // yads.pn0
    public final synchronized void release() {
        int i = this.f44837c - 1;
        this.f44837c = i;
        if (i == 0) {
            this.f44836b.release();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0118 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0204  */
    @Override // yads.pn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.ln0 a(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) throws android.media.NotProvisionedException {
        /*
            Method dump skipped, instruction units count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.xx0.a(byte[], java.util.List, int, java.util.HashMap):yads.ln0");
    }

    @Override // yads.pn0
    public final void b(byte[] bArr) {
        this.f44836b.closeSession(bArr);
    }

    @Override // yads.pn0
    public final void c(byte[] bArr) throws DeniedByServerException {
        this.f44836b.provideProvisionResponse(bArr);
    }

    public static /* synthetic */ pn0 b(UUID uuid) {
        try {
            return c(uuid);
        } catch (oa3 unused) {
            kh1.b("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new zk0();
        }
    }

    public static xx0 c(UUID uuid) throws oa3 {
        try {
            return new xx0(uuid);
        } catch (UnsupportedSchemeException e3) {
            throw new oa3(e3);
        } catch (Exception e7) {
            throw new oa3(e7);
        }
    }

    @Override // yads.pn0
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (jr.f39934c.equals(this.f44835a) && lb3.f40466a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr2, bu.f37146c));
                StringBuilder sb2 = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb2.append(StringUtils.COMMA);
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb2.append("{\"k\":\"");
                    sb2.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kid\":\"");
                    sb2.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb2.append("\",\"kty\":\"");
                    sb2.append(jSONObject2.getString("kty"));
                    sb2.append("\"}");
                }
                sb2.append("]}");
                bArr2 = sb2.toString().getBytes(bu.f37146c);
            } catch (JSONException e3) {
                kh1.b("ClearKeyUtil", kh1.a("Failed to adjust response data: ".concat(new String(bArr2, bu.f37146c)), e3));
            }
        }
        return this.f44836b.provideKeyResponse(bArr, bArr2);
    }

    public static boolean d() {
        return rk2.f42620f.a().equals(lb3.f40469d);
    }

    @Override // yads.pn0
    public final on0 a() {
        MediaDrm.ProvisionRequest provisionRequest = this.f44836b.getProvisionRequest();
        return new on0(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    public final void a(mn0 mn0Var, MediaDrm mediaDrm, byte[] bArr, int i, int i10, byte[] bArr2) {
        bd0 bd0Var = ((ad0) mn0Var).f36691a.f38730y;
        bd0Var.getClass();
        bd0Var.obtainMessage(i, bArr).sendToTarget();
    }

    @Override // yads.pn0
    public final Map a(byte[] bArr) {
        return this.f44836b.queryKeyStatus(bArr);
    }

    @Override // yads.pn0
    public final void a(byte[] bArr, byte[] bArr2) {
        this.f44836b.restoreKeys(bArr, bArr2);
    }

    @Override // yads.pn0
    public final void a(final ad0 ad0Var) {
        this.f44836b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: zl.d1
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i10, byte[] bArr2) {
                this.f46552a.a(ad0Var, mediaDrm, bArr, i, i10, bArr2);
            }
        });
    }

    @Override // yads.pn0
    public final void a(byte[] bArr, af2 af2Var) {
        if (lb3.f40466a >= 31) {
            try {
                wx0.a(this.f44836b, bArr, af2Var);
            } catch (UnsupportedOperationException unused) {
                kh1.d("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // yads.pn0
    public final boolean a(String str, byte[] bArr) {
        if (lb3.f40466a >= 31) {
            return wx0.a(this.f44836b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f44835a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    public static UUID a(UUID uuid) {
        return (lb3.f40466a >= 27 || !jr.f39934c.equals(uuid)) ? uuid : jr.f39933b;
    }
}
