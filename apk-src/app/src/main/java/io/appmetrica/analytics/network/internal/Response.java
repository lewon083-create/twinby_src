package io.appmetrica.analytics.network.internal;

import a0.u;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.network.impl.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class Response {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f25287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f25289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f25290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f25291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Throwable f25292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f25293g;

    public Response(Throwable th2) {
        this(false, 0, new byte[0], new byte[0], new HashMap(), th2);
    }

    public int getCode() {
        return this.f25288b;
    }

    @NonNull
    public byte[] getErrorData() {
        return this.f25290d;
    }

    public Throwable getException() {
        return this.f25292f;
    }

    @NonNull
    public Map<String, List<String>> getHeaders() {
        return this.f25291e;
    }

    @NonNull
    public byte[] getResponseData() {
        return this.f25289c;
    }

    public String getUrl() {
        return this.f25293g;
    }

    public boolean isCompleted() {
        return this.f25287a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Response{completed=");
        sb2.append(this.f25287a);
        sb2.append(", code=");
        sb2.append(this.f25288b);
        sb2.append(", responseDataLength=");
        sb2.append(this.f25289c.length);
        sb2.append(", errorDataLength=");
        sb2.append(this.f25290d.length);
        sb2.append(", headers=");
        sb2.append(this.f25291e);
        sb2.append(", exception=");
        sb2.append(this.f25292f);
        sb2.append(", url=");
        return u.n(sb2, this.f25293g, '}');
    }

    public Response(boolean z5, int i, @NonNull byte[] bArr, @NonNull byte[] bArr2, Map<String, List<String>> map, Throwable th2) {
        this(z5, i, bArr, bArr2, map, th2, null);
    }

    public Response(boolean z5, int i, @NonNull byte[] bArr, @NonNull byte[] bArr2, Map<String, List<String>> map, Throwable th2, String str) {
        Map mapA;
        this.f25287a = z5;
        this.f25288b = i;
        this.f25289c = bArr;
        this.f25290d = bArr2;
        if (map == null) {
            mapA = Collections.EMPTY_MAP;
        } else {
            mapA = e.a(map);
        }
        this.f25291e = mapA;
        this.f25292f = th2;
        this.f25293g = str;
    }
}
