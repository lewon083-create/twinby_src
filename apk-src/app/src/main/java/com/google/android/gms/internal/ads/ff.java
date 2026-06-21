package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class ff implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Application f5335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f5336d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5334b = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5337e = false;

    public ff(Application application, uf ufVar) {
        this.f5336d = new WeakReference(ufVar);
        this.f5335c = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f5334b) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f5336d.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                    } else if (!this.f5337e) {
                        this.f5335c.unregisterActivityLifecycleCallbacks(this);
                        this.f5337e = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f5336d.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityCreated(activity, bundle);
                    } else if (!this.f5337e) {
                        this.f5335c.unregisterActivityLifecycleCallbacks(this);
                        this.f5337e = true;
                    }
                } catch (Exception e3) {
                    u9.i.f("Error while dispatching lifecycle callback.", e3);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f5334b) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f5336d.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityDestroyed(activity);
                    } else if (!this.f5337e) {
                        this.f5335c.unregisterActivityLifecycleCallbacks(this);
                        this.f5337e = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f5336d.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityDestroyed(activity);
                    } else if (!this.f5337e) {
                        this.f5335c.unregisterActivityLifecycleCallbacks(this);
                        this.f5337e = true;
                    }
                } catch (Exception e3) {
                    u9.i.f("Error while dispatching lifecycle callback.", e3);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f5334b) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f5336d.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityPaused(activity);
                    } else if (!this.f5337e) {
                        this.f5335c.unregisterActivityLifecycleCallbacks(this);
                        this.f5337e = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f5336d.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityPaused(activity);
                    } else if (!this.f5337e) {
                        this.f5335c.unregisterActivityLifecycleCallbacks(this);
                        this.f5337e = true;
                    }
                } catch (Exception e3) {
                    u9.i.f("Error while dispatching lifecycle callback.", e3);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f5334b) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f5336d.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityResumed(activity);
                    } else if (!this.f5337e) {
                        this.f5335c.unregisterActivityLifecycleCallbacks(this);
                        this.f5337e = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f5336d.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityResumed(activity);
                    } else if (!this.f5337e) {
                        this.f5335c.unregisterActivityLifecycleCallbacks(this);
                        this.f5337e = true;
                    }
                } catch (Exception e3) {
                    u9.i.f("Error while dispatching lifecycle callback.", e3);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f5334b) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f5336d.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f5337e) {
                        this.f5335c.unregisterActivityLifecycleCallbacks(this);
                        this.f5337e = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f5336d.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivitySaveInstanceState(activity, bundle);
                    } else if (!this.f5337e) {
                        this.f5335c.unregisterActivityLifecycleCallbacks(this);
                        this.f5337e = true;
                    }
                } catch (Exception e3) {
                    u9.i.f("Error while dispatching lifecycle callback.", e3);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f5334b) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f5336d.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStarted(activity);
                    } else if (!this.f5337e) {
                        this.f5335c.unregisterActivityLifecycleCallbacks(this);
                        this.f5337e = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f5336d.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStarted(activity);
                    } else if (!this.f5337e) {
                        this.f5335c.unregisterActivityLifecycleCallbacks(this);
                        this.f5337e = true;
                    }
                } catch (Exception e3) {
                    u9.i.f("Error while dispatching lifecycle callback.", e3);
                    return;
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f5334b) {
            case 0:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.f5336d.get();
                    if (activityLifecycleCallbacks != null) {
                        activityLifecycleCallbacks.onActivityStopped(activity);
                    } else if (!this.f5337e) {
                        this.f5335c.unregisterActivityLifecycleCallbacks(this);
                        this.f5337e = true;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                try {
                    Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) this.f5336d.get();
                    if (activityLifecycleCallbacks2 != null) {
                        activityLifecycleCallbacks2.onActivityStopped(activity);
                    } else if (!this.f5337e) {
                        this.f5335c.unregisterActivityLifecycleCallbacks(this);
                        this.f5337e = true;
                    }
                } catch (Exception e3) {
                    u9.i.f("Error while dispatching lifecycle callback.", e3);
                    return;
                }
                break;
        }
    }

    public ff(Application application, gh ghVar) {
        this.f5336d = new WeakReference(ghVar);
        this.f5335c = application;
    }
}
