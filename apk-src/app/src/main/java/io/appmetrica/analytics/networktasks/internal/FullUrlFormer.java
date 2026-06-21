package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.impl.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class FullUrlFormer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f25320a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25321b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f25322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IParamsAppender f25323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConfigProvider f25324e;

    public FullUrlFormer(@NonNull IParamsAppender<T> iParamsAppender, @NonNull ConfigProvider<T> configProvider) {
        this.f25323d = iParamsAppender;
        this.f25324e = configProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void buildAndSetFullHostUrl() {
        Uri.Builder builderBuildUpon = Uri.parse((String) this.f25320a.get(this.f25321b)).buildUpon();
        this.f25323d.appendParams(builderBuildUpon, this.f25324e.getConfig());
        this.f25322c = builderBuildUpon.build().toString();
    }

    public List<String> getAllHosts() {
        return this.f25320a;
    }

    public String getUrl() {
        return new c(this.f25322c).f25295a;
    }

    public boolean hasMoreHosts() {
        return this.f25321b + 1 < this.f25320a.size();
    }

    public void incrementAttemptNumber() {
        this.f25321b++;
    }

    public void setHosts(List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f25320a = list;
    }
}
