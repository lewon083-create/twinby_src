package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class RequestDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NetworkTask.Method f25343a = NetworkTask.Method.GET;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f25344b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f25345c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f25346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f25347e;

    public void applySendTime(long j10) {
        this.f25346d = Long.valueOf(j10);
        this.f25347e = Integer.valueOf(((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j10) * 1000) / 1000);
    }

    @NonNull
    public Map<String, List<String>> getHeaders() {
        return this.f25344b;
    }

    @NonNull
    public NetworkTask.Method getMethod() {
        return this.f25343a;
    }

    public byte[] getPostData() {
        return this.f25345c;
    }

    public Long getSendTimestamp() {
        return this.f25346d;
    }

    public Integer getSendTimezoneSec() {
        return this.f25347e;
    }

    public void setHeader(@NonNull String str, @NonNull String... strArr) {
        this.f25344b.put(str, Arrays.asList(strArr));
    }

    public void setPostData(byte[] bArr) {
        this.f25343a = NetworkTask.Method.POST;
        this.f25345c = bArr;
    }
}
