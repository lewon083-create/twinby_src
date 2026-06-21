package yads;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class gy1 implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38941b = "YandexAds.UrlTracker";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f38942c = "YandexAds.BaseController";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38943a;

    public gy1(String str) {
        this.f38943a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f38943a);
    }
}
