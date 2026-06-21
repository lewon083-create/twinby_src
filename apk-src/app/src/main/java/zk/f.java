package zk;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f46360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f46361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f46362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f46363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f46364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f46365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f46366h;
    public static final f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f46367j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f f46368k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f f46369l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f46370m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f46371n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f46372o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f46373p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f f46374q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f f46375r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f f46376s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f46377t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46378a;

    static {
        i iVar = new i();
        f46360b = iVar;
        f46361c = new e();
        f46362d = new LinkedHashMap();
        i.a(iVar, "SSL_RSA_WITH_NULL_MD5");
        i.a(iVar, "SSL_RSA_WITH_NULL_SHA");
        i.a(iVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        i.a(iVar, "SSL_RSA_WITH_RC4_128_MD5");
        i.a(iVar, "SSL_RSA_WITH_RC4_128_SHA");
        i.a(iVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        i.a(iVar, "SSL_RSA_WITH_DES_CBC_SHA");
        f46363e = i.a(iVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        i.a(iVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        i.a(iVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        i.a(iVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        i.a(iVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        i.a(iVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        i.a(iVar, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        i.a(iVar, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        i.a(iVar, "SSL_DH_anon_WITH_RC4_128_MD5");
        i.a(iVar, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        i.a(iVar, "SSL_DH_anon_WITH_DES_CBC_SHA");
        i.a(iVar, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        i.a(iVar, "TLS_KRB5_WITH_DES_CBC_SHA");
        i.a(iVar, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        i.a(iVar, "TLS_KRB5_WITH_RC4_128_SHA");
        i.a(iVar, "TLS_KRB5_WITH_DES_CBC_MD5");
        i.a(iVar, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        i.a(iVar, "TLS_KRB5_WITH_RC4_128_MD5");
        i.a(iVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        i.a(iVar, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        i.a(iVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        i.a(iVar, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f46364f = i.a(iVar, "TLS_RSA_WITH_AES_128_CBC_SHA");
        i.a(iVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        i.a(iVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        i.a(iVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f46365g = i.a(iVar, "TLS_RSA_WITH_AES_256_CBC_SHA");
        i.a(iVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        i.a(iVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        i.a(iVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        i.a(iVar, "TLS_RSA_WITH_NULL_SHA256");
        i.a(iVar, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        i.a(iVar, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        i.a(iVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        i.a(iVar, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        i.a(iVar, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        i.a(iVar, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        i.a(iVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        i.a(iVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        i.a(iVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        i.a(iVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        i.a(iVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        i.a(iVar, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        i.a(iVar, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        i.a(iVar, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        i.a(iVar, "TLS_PSK_WITH_RC4_128_SHA");
        i.a(iVar, "TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        i.a(iVar, "TLS_PSK_WITH_AES_128_CBC_SHA");
        i.a(iVar, "TLS_PSK_WITH_AES_256_CBC_SHA");
        i.a(iVar, "TLS_RSA_WITH_SEED_CBC_SHA");
        f46366h = i.a(iVar, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        i = i.a(iVar, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        i.a(iVar, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        i.a(iVar, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        i.a(iVar, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        i.a(iVar, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        i.a(iVar, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        i.a(iVar, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        i.a(iVar, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        i.a(iVar, "TLS_FALLBACK_SCSV");
        i.a(iVar, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        i.a(iVar, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        i.a(iVar, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        i.a(iVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        i.a(iVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        i.a(iVar, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        i.a(iVar, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        i.a(iVar, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        i.a(iVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        i.a(iVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        i.a(iVar, "TLS_ECDH_RSA_WITH_NULL_SHA");
        i.a(iVar, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        i.a(iVar, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        i.a(iVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        i.a(iVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        i.a(iVar, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        i.a(iVar, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        i.a(iVar, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        f46367j = i.a(iVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f46368k = i.a(iVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        i.a(iVar, "TLS_ECDH_anon_WITH_NULL_SHA");
        i.a(iVar, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        i.a(iVar, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        i.a(iVar, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        i.a(iVar, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        i.a(iVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        i.a(iVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        i.a(iVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        i.a(iVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        i.a(iVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        i.a(iVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        i.a(iVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        i.a(iVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        f46369l = i.a(iVar, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f46370m = i.a(iVar, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        i.a(iVar, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        i.a(iVar, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f46371n = i.a(iVar, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f46372o = i.a(iVar, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        i.a(iVar, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        i.a(iVar, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        i.a(iVar, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        i.a(iVar, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        f46373p = i.a(iVar, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f46374q = i.a(iVar, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        i.a(iVar, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        i.a(iVar, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f46375r = i.a(iVar, "TLS_AES_128_GCM_SHA256");
        f46376s = i.a(iVar, "TLS_AES_256_GCM_SHA384");
        f46377t = i.a(iVar, "TLS_CHACHA20_POLY1305_SHA256");
        i.a(iVar, "TLS_AES_128_CCM_SHA256");
        i.a(iVar, "TLS_AES_128_CCM_8_SHA256");
    }

    public f(String str) {
        this.f46378a = str;
    }

    public final String toString() {
        return this.f46378a;
    }
}
