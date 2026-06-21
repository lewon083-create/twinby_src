package com.yandex.div.core.dagger;

import a0.u;
import android.content.Context;
import com.yandex.div.core.DivKitConfiguration;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.dagger.DivKitComponent;
import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.view2.Div2Builder;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivValidator;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivBackgroundBinder;
import com.yandex.div.core.view2.divs.DivBaseBinder;
import com.yandex.div.core.view2.divs.DivFocusBinder;
import com.yandex.div.core.view2.spannable.SpannedTextBuilder;
import com.yandex.div.core.view2.state.DivJoinedStateSwitcher;
import com.yandex.div.core.view2.state.DivMultipleStateSwitcher;
import com.yandex.div.histogram.DivParsingHistogramReporter;
import com.yandex.div.histogram.HistogramColdTypeChecker;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.histogram.reporter.HistogramReporterDelegate;
import com.yandex.div.internal.viewpool.ViewPool;
import com.yandex.div.storage.DivStorageComponent;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Yatagan$DivKitComponent implements DivKitComponent {
    final Context mApplicationContext;
    final DivKitConfiguration mDivKitConfiguration;
    private volatile Object mDivParsingHistogramReporterInstance;
    private volatile Object mDivStorageComponentInstance;
    private volatile Object mHistogramColdTypeCheckerInstance;
    private volatile Object mHistogramRecorderInstance;
    private volatile Object mSendBeaconManagerInstance;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class ComponentFactoryImpl implements DivKitComponent.Builder {
        private ComponentFactoryImpl() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Div2ComponentImpl implements Div2Component {
        private Object mDiv2BuilderInstance;
        private Object mDivActionBinderInstance;
        private Object mDivBaseBinderInstance;
        private Object mDivBinderInstance;
        private Object mDivImageLoaderInstance;
        private Object mDivRuntimeVisitorInstance;
        private Object mDivTooltipControllerInstance;
        private Object mDivTypefaceResolverInstance;
        private Object mDivValidatorInstance;
        private Object mDivViewCreatorInstance;
        private Object mJavaxInjectNamedValueThemedContextContextInstance;
        final Integer mThemeId;
        private Object mViewPoolInstance;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class ComponentFactoryImpl implements Div2Component.Builder {
        }

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Div2ViewComponentImpl implements Div2ViewComponent {
            final Div2ComponentImpl mDiv2Component;

            /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
            public static final class CachingProviderImpl implements hj.a {
                private final Div2ViewComponentImpl mDelegate;
                private final int mIndex;
                private Object mValue;

                @Override // hj.a
                public Object get() {
                    Object obj = this.mValue;
                    if (obj != null) {
                        return obj;
                    }
                    Object objSwitch$$access = this.mDelegate.switch$$access(this.mIndex);
                    this.mValue = objSwitch$$access;
                    return objSwitch$$access;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
            public static final class ComponentFactoryImpl implements Div2ViewComponent.Builder {
            }

            public Object switch$$access(int i) {
                if (i == 0) {
                    return new DivJoinedStateSwitcher(null, this.mDiv2Component.cacheDivBinder());
                }
                if (i == 1) {
                    return new DivMultipleStateSwitcher(null, this.mDiv2Component.cacheDivBinder());
                }
                throw new AssertionError();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class ProviderImpl implements hj.a {
            private final Div2ComponentImpl mDelegate;
            private final int mIndex;

            @Override // hj.a
            public Object get() {
                return this.mDelegate.switch$$access(this.mIndex);
            }
        }

        public Div2Builder cacheDiv2Builder() {
            Object div2Builder = this.mDiv2BuilderInstance;
            if (div2Builder == null) {
                div2Builder = new Div2Builder(cacheDivViewCreator(), cacheDivBinder(), cacheDivRuntimeVisitor());
                this.mDiv2BuilderInstance = div2Builder;
            }
            return (Div2Builder) div2Builder;
        }

        public DivActionBinder cacheDivActionBinder() {
            Object obj = this.mDivActionBinderInstance;
            obj.getClass();
            return (DivActionBinder) obj;
        }

        public DivBaseBinder cacheDivBaseBinder() {
            Object obj = this.mDivBaseBinderInstance;
            if (obj != null) {
                return (DivBaseBinder) obj;
            }
            new DivBackgroundBinder(cacheDivImageLoader());
            cacheDivTooltipController();
            new DivFocusBinder(cacheDivActionBinder());
            throw null;
        }

        public DivBinder cacheDivBinder() {
            Object obj = this.mDivBinderInstance;
            if (obj != null) {
                u.q(obj);
                return null;
            }
            cacheDivValidator();
            cacheDivBaseBinder();
            cacheDivTypefaceResolver();
            cacheDivTypefaceResolver();
            new SpannedTextBuilder(null, cacheDivImageLoader());
            throw null;
        }

        public DivImageLoader cacheDivImageLoader() {
            Object obj = this.mDivImageLoaderInstance;
            obj.getClass();
            return (DivImageLoader) obj;
        }

        public DivRuntimeVisitor cacheDivRuntimeVisitor() {
            Object obj = this.mDivRuntimeVisitorInstance;
            obj.getClass();
            return (DivRuntimeVisitor) obj;
        }

        public DivTooltipController cacheDivTooltipController() {
            Object obj = this.mDivTooltipControllerInstance;
            obj.getClass();
            return (DivTooltipController) obj;
        }

        public DivTypefaceResolver cacheDivTypefaceResolver() {
            Object obj = this.mDivTypefaceResolverInstance;
            obj.getClass();
            return (DivTypefaceResolver) obj;
        }

        public DivValidator cacheDivValidator() {
            Object divValidator = this.mDivValidatorInstance;
            if (divValidator == null) {
                divValidator = new DivValidator();
                this.mDivValidatorInstance = divValidator;
            }
            return (DivValidator) divValidator;
        }

        public DivViewCreator cacheDivViewCreator() {
            Object obj = this.mDivViewCreatorInstance;
            if (obj != null) {
                return (DivViewCreator) obj;
            }
            cacheJavaxInjectNamedValueThemedContextContext();
            cacheViewPool();
            cacheDivValidator();
            throw null;
        }

        public Context cacheJavaxInjectNamedValueThemedContextContext() {
            Object obj = this.mJavaxInjectNamedValueThemedContextContextInstance;
            if (obj != null) {
                return (Context) obj;
            }
            this.mThemeId.intValue();
            throw null;
        }

        public ViewPool cacheViewPool() {
            Object obj = this.mViewPoolInstance;
            obj.getClass();
            return (ViewPool) obj;
        }

        public Object switch$$access(int i) {
            if (i == 0) {
                return cacheDivBinder();
            }
            if (i == 1) {
                return cacheDiv2Builder();
            }
            if (i == 2) {
                return cacheDivViewCreator();
            }
            throw new AssertionError();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class ProviderImpl implements hj.a {
        private final Yatagan$DivKitComponent mDelegate;
        private final int mIndex;

        public ProviderImpl(Yatagan$DivKitComponent yatagan$DivKitComponent, int i) {
            this.mDelegate = yatagan$DivKitComponent;
            this.mIndex = i;
        }

        @Override // hj.a
        public Object get() {
            return this.mDelegate.switch$$access(this.mIndex);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class UninitializedLock {
    }

    public static DivKitComponent.Builder builder() {
        return new ComponentFactoryImpl();
    }

    public HistogramReporterDelegate accessHistogramReporterDelegate() {
        return DivKitHistogramsModule.INSTANCE.provideHistogramReporterDelegate(this.mDivKitConfiguration.histogramConfiguration(), new ProviderImpl(this, 4), new ProviderImpl(this, 5));
    }

    public DivParsingHistogramReporter cacheDivParsingHistogramReporter() {
        Object objProvideDivParsingHistogramReporter;
        Object obj = this.mDivParsingHistogramReporterInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    objProvideDivParsingHistogramReporter = this.mDivParsingHistogramReporterInstance;
                    if (objProvideDivParsingHistogramReporter instanceof UninitializedLock) {
                        objProvideDivParsingHistogramReporter = DivKitHistogramsModule.INSTANCE.provideDivParsingHistogramReporter(this.mDivKitConfiguration.histogramConfiguration(), new ProviderImpl(this, 0), new ProviderImpl(this, 2));
                        this.mDivParsingHistogramReporterInstance = objProvideDivParsingHistogramReporter;
                    }
                } finally {
                }
            }
            obj = objProvideDivParsingHistogramReporter;
        }
        return (DivParsingHistogramReporter) obj;
    }

    public DivStorageComponent cacheDivStorageComponent() {
        Object objProvideDivStorageComponent;
        Object obj = this.mDivStorageComponentInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    objProvideDivStorageComponent = this.mDivStorageComponentInstance;
                    if (objProvideDivStorageComponent instanceof UninitializedLock) {
                        objProvideDivStorageComponent = DivStorageModule.INSTANCE.provideDivStorageComponent(this.mDivKitConfiguration.externalDivStorageComponent(), this.mApplicationContext, accessHistogramReporterDelegate(), cacheDivParsingHistogramReporter());
                        this.mDivStorageComponentInstance = objProvideDivStorageComponent;
                    }
                } finally {
                }
            }
            obj = objProvideDivStorageComponent;
        }
        return (DivStorageComponent) obj;
    }

    public HistogramColdTypeChecker cacheHistogramColdTypeChecker() {
        Object histogramColdTypeChecker;
        Object obj = this.mHistogramColdTypeCheckerInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    histogramColdTypeChecker = this.mHistogramColdTypeCheckerInstance;
                    if (histogramColdTypeChecker instanceof UninitializedLock) {
                        histogramColdTypeChecker = new HistogramColdTypeChecker();
                        this.mHistogramColdTypeCheckerInstance = histogramColdTypeChecker;
                    }
                } finally {
                }
            }
            obj = histogramColdTypeChecker;
        }
        return (HistogramColdTypeChecker) obj;
    }

    public HistogramRecorder cacheHistogramRecorder() {
        Object objHistogramRecorder;
        Object obj = this.mHistogramRecorderInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    objHistogramRecorder = this.mHistogramRecorderInstance;
                    if (objHistogramRecorder instanceof UninitializedLock) {
                        objHistogramRecorder = this.mDivKitConfiguration.histogramRecorder();
                        this.mHistogramRecorderInstance = objHistogramRecorder;
                    }
                } finally {
                }
            }
            obj = objHistogramRecorder;
        }
        return (HistogramRecorder) obj;
    }

    public xg.b cacheSendBeaconManager() {
        Object objProvideSendBeaconManager;
        Object obj = this.mSendBeaconManagerInstance;
        if (obj instanceof UninitializedLock) {
            synchronized (obj) {
                try {
                    objProvideSendBeaconManager = this.mSendBeaconManagerInstance;
                    if (objProvideSendBeaconManager instanceof UninitializedLock) {
                        DivKitModule divKitModule = DivKitModule.INSTANCE;
                        Context context = this.mApplicationContext;
                        this.mDivKitConfiguration.sendBeaconConfiguration();
                        objProvideSendBeaconManager = DivKitModule.provideSendBeaconManager(context, null);
                        this.mSendBeaconManagerInstance = objProvideSendBeaconManager;
                    }
                } finally {
                }
            }
            obj = objProvideSendBeaconManager;
        }
        return (xg.b) obj;
    }

    public Object switch$$access(int i) {
        if (i == 0) {
            return accessHistogramReporterDelegate();
        }
        if (i == 1) {
            return cacheDivStorageComponent();
        }
        if (i == 2) {
            return this.mDivKitConfiguration.executorService();
        }
        if (i == 3) {
            return cacheSendBeaconManager();
        }
        if (i == 4) {
            return cacheHistogramRecorder();
        }
        if (i == 5) {
            return cacheHistogramColdTypeChecker();
        }
        throw new AssertionError();
    }
}
