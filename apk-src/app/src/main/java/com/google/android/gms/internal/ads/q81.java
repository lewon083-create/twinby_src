package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Logger f9367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Serializable f9368d;

    public q81(int i, Class cls) {
        this.f9365a = i;
        switch (i) {
            case 1:
                this.f9368d = new com.google.android.gms.internal.play_billing.j();
                this.f9366b = cls.getName();
                break;
            default:
                this.f9368d = new t31();
                this.f9366b = cls.getName();
                break;
        }
    }

    public final Logger a() {
        Logger logger;
        Logger logger2;
        switch (this.f9365a) {
            case 0:
                Logger logger3 = this.f9367c;
                if (logger3 != null) {
                    return logger3;
                }
                synchronized (((t31) this.f9368d)) {
                    try {
                        logger = this.f9367c;
                        if (logger == null) {
                            logger = Logger.getLogger(this.f9366b);
                            this.f9367c = logger;
                        }
                    } finally {
                    }
                }
                return logger;
            default:
                Logger logger4 = this.f9367c;
                if (logger4 != null) {
                    return logger4;
                }
                synchronized (((com.google.android.gms.internal.play_billing.j) this.f9368d)) {
                    try {
                        logger2 = this.f9367c;
                        if (logger2 == null) {
                            logger2 = Logger.getLogger(this.f9366b);
                            this.f9367c = logger2;
                        }
                    } finally {
                    }
                }
                return logger2;
        }
    }
}
