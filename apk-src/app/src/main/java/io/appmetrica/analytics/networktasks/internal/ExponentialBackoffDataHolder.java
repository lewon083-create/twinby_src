package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import pe.a;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public class ExponentialBackoffDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimePassedChecker f25313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeProvider f25314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HostRetryInfoProvider f25315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f25316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f25317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f25318f;

    public ExponentialBackoffDataHolder(@NonNull HostRetryInfoProvider hostRetryInfoProvider, @NonNull String str) {
        this(hostRetryInfoProvider, new SystemTimeProvider(), new TimePassedChecker(), str);
    }

    public void reset() {
        this.f25317e = 1;
        this.f25316d = 0L;
        this.f25315c.saveNextSendAttemptNumber(1);
        this.f25315c.saveLastAttemptTimeSeconds(this.f25316d);
    }

    public void updateLastAttemptInfo() {
        long jCurrentTimeSeconds = this.f25314b.currentTimeSeconds();
        this.f25316d = jCurrentTimeSeconds;
        this.f25317e++;
        this.f25315c.saveLastAttemptTimeSeconds(jCurrentTimeSeconds);
        this.f25315c.saveNextSendAttemptNumber(this.f25317e);
    }

    public boolean wasLastAttemptLongAgoEnough(RetryPolicyConfig retryPolicyConfig) {
        if (retryPolicyConfig != null) {
            long j10 = this.f25316d;
            if (j10 != 0) {
                TimePassedChecker timePassedChecker = this.f25313a;
                int i = ((1 << (this.f25317e - 1)) - 1) * retryPolicyConfig.exponentialMultiplier;
                int i10 = retryPolicyConfig.maxIntervalSeconds;
                if (i > i10) {
                    i = i10;
                }
                return timePassedChecker.didTimePassSeconds(j10, i, this.f25318f);
            }
        }
        return true;
    }

    public ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, SystemTimeProvider systemTimeProvider, TimePassedChecker timePassedChecker, String str) {
        this.f25315c = hostRetryInfoProvider;
        this.f25314b = systemTimeProvider;
        this.f25313a = timePassedChecker;
        this.f25316d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.f25317e = hostRetryInfoProvider.getNextSendAttemptNumber();
        this.f25318f = a.f("[ExponentialBackoffDataHolder-", str, "]");
    }
}
