package io.sentry.android.core;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class SentryShakeDetector implements SensorEventListener {
    static final int ACCELERATION_THRESHOLD = 13;

    @Nullable
    private Sensor accelerometer;

    @Nullable
    private Handler handler;

    @Nullable
    private HandlerThread handlerThread;

    @Nullable
    private volatile Listener listener;

    @NotNull
    private ILogger logger;

    @NotNull
    private final SampleQueue queue = new SampleQueue();

    @Nullable
    private SensorManager sensorManager;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public interface Listener {
        void onShake();
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class Sample {
        boolean accelerating;

        @Nullable
        Sample next;
        long timestamp;
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class SamplePool {

        @Nullable
        private Sample head;

        @NotNull
        public Sample acquire() {
            Sample sample = this.head;
            if (sample == null) {
                return new Sample();
            }
            this.head = sample.next;
            return sample;
        }

        public void release(@NotNull Sample sample) {
            sample.next = this.head;
            this.head = sample;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static class SampleQueue {
        private static final long MAX_WINDOW_SIZE_NS = 500000000;
        private static final int MIN_QUEUE_SIZE = 4;
        private static final long MIN_WINDOW_SIZE_NS = 250000000;
        private int acceleratingCount;

        @Nullable
        private Sample newest;

        @Nullable
        private Sample oldest;

        @NotNull
        private final SamplePool pool = new SamplePool();
        private int sampleCount;

        private void purge(long j10) {
            Sample sample;
            while (true) {
                int i = this.sampleCount;
                if (i < 4 || (sample = this.oldest) == null || j10 - sample.timestamp <= 0) {
                    return;
                }
                if (sample.accelerating) {
                    this.acceleratingCount--;
                }
                this.sampleCount = i - 1;
                Sample sample2 = sample.next;
                this.oldest = sample2;
                if (sample2 == null) {
                    this.newest = null;
                }
                this.pool.release(sample);
            }
        }

        public void add(long j10, boolean z5) {
            purge(j10 - MAX_WINDOW_SIZE_NS);
            Sample sampleAcquire = this.pool.acquire();
            sampleAcquire.timestamp = j10;
            sampleAcquire.accelerating = z5;
            sampleAcquire.next = null;
            Sample sample = this.newest;
            if (sample != null) {
                sample.next = sampleAcquire;
            }
            this.newest = sampleAcquire;
            if (this.oldest == null) {
                this.oldest = sampleAcquire;
            }
            this.sampleCount++;
            if (z5) {
                this.acceleratingCount++;
            }
        }

        public void clear() {
            while (true) {
                Sample sample = this.oldest;
                if (sample == null) {
                    this.newest = null;
                    this.sampleCount = 0;
                    this.acceleratingCount = 0;
                    return;
                }
                this.oldest = sample.next;
                this.pool.release(sample);
            }
        }

        public boolean isShaking() {
            Sample sample;
            int i;
            Sample sample2 = this.newest;
            return sample2 != null && (sample = this.oldest) != null && (i = this.sampleCount) >= 4 && sample2.timestamp - sample.timestamp >= MIN_WINDOW_SIZE_NS && this.acceleratingCount >= (i >> 1) + (i >> 2);
        }
    }

    public SentryShakeDetector(@NotNull ILogger iLogger) {
        this.logger = iLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$stop$0() {
        this.queue.clear();
    }

    public void close() {
        stop();
        HandlerThread handlerThread = this.handlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.handlerThread = null;
            this.handler = null;
        }
    }

    public void init(@NotNull Context context, @NotNull ILogger iLogger) {
        this.logger = iLogger;
        init(context);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@NotNull SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() != 1) {
            return;
        }
        float[] fArr = sensorEvent.values;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        this.queue.add(sensorEvent.timestamp, Math.sqrt((double) ((f12 * f12) + ((f11 * f11) + (f10 * f10)))) > 13.0d);
        if (this.queue.isShaking()) {
            this.queue.clear();
            Listener listener = this.listener;
            if (listener != null) {
                listener.onShake();
            }
        }
    }

    public void start(@NotNull Context context, @NotNull Listener listener) {
        this.listener = listener;
        init(context);
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager == null) {
            this.logger.log(SentryLevel.WARNING, "SensorManager is not available. Shake detection disabled.", new Object[0]);
            return;
        }
        Sensor sensor = this.accelerometer;
        if (sensor == null) {
            this.logger.log(SentryLevel.WARNING, "Accelerometer sensor not available. Shake detection disabled.", new Object[0]);
        } else {
            sensorManager.registerListener(this, sensor, 3, this.handler);
        }
    }

    public void stop() {
        this.listener = null;
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.post(new d(4, this));
        }
    }

    private void init(@NotNull Context context) {
        if (this.sensorManager == null) {
            this.sensorManager = (SensorManager) context.getSystemService("sensor");
        }
        SensorManager sensorManager = this.sensorManager;
        if (sensorManager != null && this.accelerometer == null) {
            this.accelerometer = sensorManager.getDefaultSensor(1, false);
        }
        if (this.accelerometer == null || this.handlerThread != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("sentry-shake");
        this.handlerThread = handlerThread;
        handlerThread.start();
        this.handler = new Handler(this.handlerThread.getLooper());
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@NotNull Sensor sensor, int i) {
    }
}
