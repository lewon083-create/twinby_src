package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class lz extends h41 implements zj1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Pattern f7677w = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7680h;
    public final n90 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public db1 f7681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HttpURLConnection f7682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayDeque f7683l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InputStream f7684m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7685n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7686o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f7687p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f7688q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f7689r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f7690s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f7691t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f7692u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f7693v;

    public lz(String str, jz jzVar, int i, int i10, long j10, long j11) {
        super(true);
        ix.o(true ^ TextUtils.isEmpty(str));
        this.f7680h = str;
        this.i = new n90(23);
        this.f7678f = i;
        this.f7679g = i10;
        this.f7683l = new ArrayDeque();
        this.f7692u = j10;
        this.f7693v = j11;
        if (jzVar != null) {
            H(jzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.ct1
    public final int C(byte[] bArr, int i, int i10) throws ih1 {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j10 = this.f7687p;
            long j11 = this.f7688q;
            if (j10 - j11 == 0) {
                return -1;
            }
            long j12 = this.f7689r + j11;
            long j13 = i10;
            long j14 = j12 + j13 + this.f7693v;
            long j15 = this.f7691t;
            long j16 = j15 + 1;
            if (j14 > j16) {
                long j17 = this.f7690s;
                if (j15 < j17) {
                    long jMin = Math.min(j17, Math.max(((this.f7692u + j16) - r4) - 1, (j16 + j13) - 1));
                    h(2, j16, jMin);
                    this.f7691t = jMin;
                    j15 = jMin;
                }
            }
            int i11 = this.f7684m.read(bArr, i, (int) Math.min(j13, ((j15 + 1) - this.f7689r) - this.f7688q));
            if (i11 == -1) {
                throw new EOFException();
            }
            this.f7688q += (long) i11;
            c(i11);
            return i11;
        } catch (IOException e3) {
            throw new ih1(e3, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.g91, com.google.android.gms.internal.ads.zj1
    public final Map d() {
        HttpURLConnection httpURLConnection = this.f7682k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final void g() {
        try {
            InputStream inputStream = this.f7684m;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    throw new ih1(e3, 2000, 3);
                }
            }
        } finally {
            this.f7684m = null;
            i();
            if (this.f7685n) {
                this.f7685n = false;
                f();
            }
        }
    }

    public final HttpURLConnection h(int i, long j10, long j11) throws ih1 {
        String string = this.f7681j.f4544a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.f7678f);
            httpURLConnection.setReadTimeout(this.f7679g);
            for (Map.Entry entry : this.i.e().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 7 + String.valueOf(j11).length());
            sb2.append("bytes=");
            sb2.append(j10);
            sb2.append("-");
            sb2.append(j11);
            httpURLConnection.setRequestProperty("Range", sb2.toString());
            httpURLConnection.setRequestProperty("User-Agent", this.f7680h);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f7683l.add(httpURLConnection);
            String string2 = this.f7681j.f4544a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f7686o = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    httpURLConnection.getHeaderFields();
                    i();
                    int i10 = this.f7686o;
                    throw new kz(l7.o.j(i10, "Response code: ", new StringBuilder(String.valueOf(i10).length() + 15)), 2000, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f7684m != null) {
                        inputStream = new SequenceInputStream(this.f7684m, inputStream);
                    }
                    this.f7684m = inputStream;
                    return httpURLConnection;
                } catch (IOException e3) {
                    i();
                    throw new ih1(e3, 2000, i);
                }
            } catch (IOException e7) {
                i();
                throw new ih1("Unable to connect to ".concat(String.valueOf(string2)), e7, 2000, i);
            }
        } catch (IOException e10) {
            throw new ih1("Unable to connect to ".concat(String.valueOf(string)), e10, 2000, i);
        }
    }

    public final void i() {
        while (true) {
            ArrayDeque arrayDeque = this.f7683l;
            if (arrayDeque.isEmpty()) {
                this.f7682k = null;
                return;
            } else {
                try {
                    ((HttpURLConnection) arrayDeque.remove()).disconnect();
                } catch (Exception e3) {
                    u9.i.f("Unexpected error while disconnecting", e3);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final long k(db1 db1Var) throws ih1 {
        this.f7681j = db1Var;
        this.f7688q = 0L;
        long j10 = db1Var.f4546c;
        long j11 = db1Var.f4547d;
        long jMin = this.f7692u;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11);
        }
        this.f7689r = j10;
        HttpURLConnection httpURLConnectionH = h(1, j10, (jMin + j10) - 1);
        this.f7682k = httpURLConnectionH;
        String headerField = httpURLConnectionH.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f7677w.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j12 = Long.parseLong(matcher.group(2));
                    long j13 = Long.parseLong(matcher.group(3));
                    if (j11 != -1) {
                        this.f7687p = j11;
                        this.f7690s = Math.max(j12, (this.f7689r + j11) - 1);
                    } else {
                        this.f7687p = j13 - this.f7689r;
                        this.f7690s = j13 - 1;
                    }
                    this.f7691t = j12;
                    this.f7685n = true;
                    b(db1Var);
                    return this.f7687p;
                } catch (NumberFormatException unused) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(headerField).length() + 27);
                    sb2.append("Unexpected Content-Range [");
                    sb2.append(headerField);
                    sb2.append("]");
                    u9.i.e(sb2.toString());
                }
            }
        }
        throw new kz("Invalid content range: ".concat(String.valueOf(headerField)), 2000, 1);
    }

    @Override // com.google.android.gms.internal.ads.g91
    public final Uri l() {
        HttpURLConnection httpURLConnection = this.f7682k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }
}
