package yads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class x11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o30 f44570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f44573d;

    public x11(String str, boolean z5, pd0 pd0Var) {
        ni.a((z5 && TextUtils.isEmpty(str)) ? false : true);
        this.f44570a = pd0Var;
        this.f44571b = str;
        this.f44572c = z5;
        this.f44573d = new HashMap();
    }

    public final byte[] a(UUID uuid, ln0 ln0Var) {
        String str = ln0Var.f40612b;
        if (this.f44572c || TextUtils.isEmpty(str)) {
            str = this.f44571b;
        }
        if (TextUtils.isEmpty(str)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            ni.a(uri, "The uri must be set.");
            throw new jl1(new u30(uri, 0L, 1, null, map, 0L, -1L, null, 0, null), uri, zm2.f45462h, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map2 = new HashMap();
        UUID uuid2 = jr.f39936e;
        map2.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : jr.f39934c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            map2.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f44573d) {
            map2.putAll(this.f44573d);
        }
        return a(this.f44570a, str, ln0Var.f40611a, map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static byte[] a(o30 o30Var, String str, byte[] bArr, Map map) throws Throwable {
        Exception exc;
        Object obj;
        Map map2;
        List list;
        byte[] bArr2;
        ByteArrayOutputStream byteArrayOutputStream;
        u33 u33Var = new u33(o30Var.createDataSource());
        Uri uri = Uri.parse(str);
        ni.a(uri, "The uri must be set.");
        String str2 = "The uri must be set.";
        u30 u30Var = new u30(uri, 0L, 2, bArr, map, 0L, -1L, null, 1, null);
        int i = 0;
        u30 u30Var2 = u30Var;
        int i10 = 0;
        Object obj2 = u30Var;
        Object obj3 = str;
        while (true) {
            try {
                r30 r30Var = new r30(u33Var, u30Var2);
                try {
                    try {
                        int i11 = lb3.f40466a;
                        bArr2 = new byte[4096];
                        byteArrayOutputStream = new ByteArrayOutputStream();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    while (true) {
                        int i12 = r30Var.read(bArr2);
                        if (i12 != -1) {
                            byteArrayOutputStream.write(bArr2, i, i12);
                        } else {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            try {
                                lb3.a((Closeable) r30Var);
                                return byteArray;
                            } catch (Exception e3) {
                                exc = e3;
                                obj = obj2;
                                Uri uri2 = u33Var.f43545c;
                                uri2.getClass();
                                throw new jl1(obj, uri2, u33Var.f43543a.getResponseHeaders(), u33Var.f43544b, exc);
                            }
                        }
                        lb3.a((Closeable) r30Var);
                        throw th;
                    }
                } catch (t11 e7) {
                    int i13 = e7.f43156e;
                    String str3 = ((i13 != 307 && i13 != 308) || i10 >= 5 || (map2 = e7.f43157f) == null || (list = (List) map2.get("Location")) == null || list.isEmpty()) ? null : (String) list.get(i);
                    if (str3 != null) {
                        i10++;
                        long j10 = u30Var2.f43534b;
                        int i14 = u30Var2.f43535c;
                        byte[] bArr3 = u30Var2.f43536d;
                        Map map3 = u30Var2.f43537e;
                        long j11 = u30Var2.f43538f;
                        long j12 = u30Var2.f43539g;
                        String str4 = u30Var2.f43540h;
                        int i15 = u30Var2.i;
                        Object obj4 = u30Var2.f43541j;
                        Uri uri3 = Uri.parse(str3);
                        obj3 = obj2;
                        String str5 = str2;
                        try {
                            ni.a(uri3, str5);
                            u30 u30Var3 = new u30(uri3, j10, i14, bArr3, map3, j11, j12, str4, i15, obj4);
                            try {
                                lb3.a((Closeable) r30Var);
                                str2 = str5;
                                u30Var2 = u30Var3;
                                i = 0;
                                obj2 = obj3;
                                obj3 = obj3;
                            } catch (Exception e10) {
                                e = e10;
                                exc = e;
                                obj = obj3;
                                Uri uri22 = u33Var.f43545c;
                                uri22.getClass();
                                throw new jl1(obj, uri22, u33Var.f43543a.getResponseHeaders(), u33Var.f43544b, exc);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        throw e7;
                    }
                    th = th3;
                    lb3.a((Closeable) r30Var);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                obj3 = obj2;
            }
        }
    }

    public final byte[] a(on0 on0Var) {
        return a(this.f44570a, on0Var.f41655b + "&signedRequest=" + lb3.a(on0Var.f41654a), null, Collections.EMPTY_MAP);
    }
}
