package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.JsonDeserializer;
import io.sentry.JsonSerializable;
import io.sentry.JsonUnknown;
import io.sentry.ObjectReader;
import io.sentry.ObjectWriter;
import io.sentry.util.CollectionUtils;
import io.sentry.util.Objects;
import io.sentry.vendor.gson.stream.JsonToken;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Device implements JsonUnknown, JsonSerializable {
    public static final String TYPE = "device";

    @Nullable
    private String[] archs;

    @Nullable
    private Float batteryLevel;

    @Nullable
    private Float batteryTemperature;

    @Nullable
    private Date bootTime;

    @Nullable
    private String brand;

    @Nullable
    private Boolean charging;

    @Nullable
    private String chipset;

    @Nullable
    private String connectionType;

    @Nullable
    private String cpuDescription;

    @Nullable
    private Long externalFreeStorage;

    @Nullable
    private Long externalStorageSize;

    @Nullable
    private String family;

    @Nullable
    private Long freeMemory;

    @Nullable
    private Long freeStorage;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Nullable
    private String f26064id;

    @Nullable
    private String locale;

    @Nullable
    private Boolean lowMemory;

    @Nullable
    private String manufacturer;

    @Nullable
    private Long memorySize;

    @Nullable
    private String model;

    @Nullable
    private String modelId;

    @Nullable
    private String name;

    @Nullable
    private Boolean online;

    @Nullable
    private DeviceOrientation orientation;

    @Nullable
    private Integer processorCount;

    @Nullable
    private Double processorFrequency;

    @Nullable
    private Float screenDensity;

    @Nullable
    private Integer screenDpi;

    @Nullable
    private Integer screenHeightPixels;

    @Nullable
    private Integer screenWidthPixels;

    @Nullable
    private Boolean simulator;

    @Nullable
    private Long storageSize;

    @Nullable
    private TimeZone timezone;

    @Nullable
    private Map<String, Object> unknown;

    @Nullable
    private Long usableMemory;

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class Deserializer implements JsonDeserializer<Device> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.sentry.JsonDeserializer
        @NotNull
        public Device deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
            String strNextName;
            objectReader.beginObject();
            Device device = new Device();
            ConcurrentHashMap concurrentHashMap = null;
            while (objectReader.peek() == JsonToken.NAME) {
                strNextName = objectReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "timezone":
                        device.timezone = objectReader.nextTimeZoneOrNull(iLogger);
                        break;
                    case "boot_time":
                        if (objectReader.peek() != JsonToken.STRING) {
                            break;
                        } else {
                            device.bootTime = objectReader.nextDateOrNull(iLogger);
                            break;
                        }
                        break;
                    case "simulator":
                        device.simulator = objectReader.nextBooleanOrNull();
                        break;
                    case "manufacturer":
                        device.manufacturer = objectReader.nextStringOrNull();
                        break;
                    case "processor_count":
                        device.processorCount = objectReader.nextIntegerOrNull();
                        break;
                    case "orientation":
                        device.orientation = (DeviceOrientation) objectReader.nextOrNull(iLogger, new DeviceOrientation.Deserializer());
                        break;
                    case "battery_temperature":
                        device.batteryTemperature = objectReader.nextFloatOrNull();
                        break;
                    case "family":
                        device.family = objectReader.nextStringOrNull();
                        break;
                    case "locale":
                        device.locale = objectReader.nextStringOrNull();
                        break;
                    case "online":
                        device.online = objectReader.nextBooleanOrNull();
                        break;
                    case "battery_level":
                        device.batteryLevel = objectReader.nextFloatOrNull();
                        break;
                    case "model_id":
                        device.modelId = objectReader.nextStringOrNull();
                        break;
                    case "screen_density":
                        device.screenDensity = objectReader.nextFloatOrNull();
                        break;
                    case "screen_dpi":
                        device.screenDpi = objectReader.nextIntegerOrNull();
                        break;
                    case "free_memory":
                        device.freeMemory = objectReader.nextLongOrNull();
                        break;
                    case "id":
                        device.f26064id = objectReader.nextStringOrNull();
                        break;
                    case "name":
                        device.name = objectReader.nextStringOrNull();
                        break;
                    case "low_memory":
                        device.lowMemory = objectReader.nextBooleanOrNull();
                        break;
                    case "archs":
                        List list = (List) objectReader.nextObjectOrNull();
                        if (list == null) {
                            break;
                        } else {
                            String[] strArr = new String[list.size()];
                            list.toArray(strArr);
                            device.archs = strArr;
                            break;
                        }
                        break;
                    case "brand":
                        device.brand = objectReader.nextStringOrNull();
                        break;
                    case "model":
                        device.model = objectReader.nextStringOrNull();
                        break;
                    case "cpu_description":
                        device.cpuDescription = objectReader.nextStringOrNull();
                        break;
                    case "processor_frequency":
                        device.processorFrequency = objectReader.nextDoubleOrNull();
                        break;
                    case "connection_type":
                        device.connectionType = objectReader.nextStringOrNull();
                        break;
                    case "chipset":
                        device.chipset = objectReader.nextStringOrNull();
                        break;
                    case "screen_width_pixels":
                        device.screenWidthPixels = objectReader.nextIntegerOrNull();
                        break;
                    case "external_storage_size":
                        device.externalStorageSize = objectReader.nextLongOrNull();
                        break;
                    case "storage_size":
                        device.storageSize = objectReader.nextLongOrNull();
                        break;
                    case "usable_memory":
                        device.usableMemory = objectReader.nextLongOrNull();
                        break;
                    case "memory_size":
                        device.memorySize = objectReader.nextLongOrNull();
                        break;
                    case "charging":
                        device.charging = objectReader.nextBooleanOrNull();
                        break;
                    case "external_free_storage":
                        device.externalFreeStorage = objectReader.nextLongOrNull();
                        break;
                    case "free_storage":
                        device.freeStorage = objectReader.nextLongOrNull();
                        break;
                    case "screen_height_pixels":
                        device.screenHeightPixels = objectReader.nextIntegerOrNull();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        objectReader.nextUnknown(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            device.setUnknown(concurrentHashMap);
            objectReader.endObject();
            return device;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public enum DeviceOrientation implements JsonSerializable {
        PORTRAIT,
        LANDSCAPE;

        /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
        public static final class Deserializer implements JsonDeserializer<DeviceOrientation> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.sentry.JsonDeserializer
            @NotNull
            public DeviceOrientation deserialize(@NotNull ObjectReader objectReader, @NotNull ILogger iLogger) {
                return DeviceOrientation.valueOf(objectReader.nextString().toUpperCase(Locale.ROOT));
            }
        }

        @Override // io.sentry.JsonSerializable
        public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
            objectWriter.value(toString().toLowerCase(Locale.ROOT));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
    public static final class JsonKeys {
        public static final String ARCHS = "archs";
        public static final String BATTERY_LEVEL = "battery_level";
        public static final String BATTERY_TEMPERATURE = "battery_temperature";
        public static final String BOOT_TIME = "boot_time";
        public static final String BRAND = "brand";
        public static final String CHARGING = "charging";
        public static final String CHIPSET = "chipset";
        public static final String CONNECTION_TYPE = "connection_type";
        public static final String CPU_DESCRIPTION = "cpu_description";
        public static final String EXTERNAL_FREE_STORAGE = "external_free_storage";
        public static final String EXTERNAL_STORAGE_SIZE = "external_storage_size";
        public static final String FAMILY = "family";
        public static final String FREE_MEMORY = "free_memory";
        public static final String FREE_STORAGE = "free_storage";
        public static final String ID = "id";
        public static final String LOCALE = "locale";
        public static final String LOW_MEMORY = "low_memory";
        public static final String MANUFACTURER = "manufacturer";
        public static final String MEMORY_SIZE = "memory_size";
        public static final String MODEL = "model";
        public static final String MODEL_ID = "model_id";
        public static final String NAME = "name";
        public static final String ONLINE = "online";
        public static final String ORIENTATION = "orientation";
        public static final String PROCESSOR_COUNT = "processor_count";
        public static final String PROCESSOR_FREQUENCY = "processor_frequency";
        public static final String SCREEN_DENSITY = "screen_density";
        public static final String SCREEN_DPI = "screen_dpi";
        public static final String SCREEN_HEIGHT_PIXELS = "screen_height_pixels";
        public static final String SCREEN_WIDTH_PIXELS = "screen_width_pixels";
        public static final String SIMULATOR = "simulator";
        public static final String STORAGE_SIZE = "storage_size";
        public static final String TIMEZONE = "timezone";
        public static final String USABLE_MEMORY = "usable_memory";
    }

    public Device() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Device.class == obj.getClass()) {
            Device device = (Device) obj;
            if (Objects.equals(this.name, device.name) && Objects.equals(this.manufacturer, device.manufacturer) && Objects.equals(this.brand, device.brand) && Objects.equals(this.family, device.family) && Objects.equals(this.model, device.model) && Objects.equals(this.modelId, device.modelId) && Arrays.equals(this.archs, device.archs) && Objects.equals(this.batteryLevel, device.batteryLevel) && Objects.equals(this.charging, device.charging) && Objects.equals(this.online, device.online) && this.orientation == device.orientation && Objects.equals(this.simulator, device.simulator) && Objects.equals(this.memorySize, device.memorySize) && Objects.equals(this.freeMemory, device.freeMemory) && Objects.equals(this.usableMemory, device.usableMemory) && Objects.equals(this.lowMemory, device.lowMemory) && Objects.equals(this.storageSize, device.storageSize) && Objects.equals(this.freeStorage, device.freeStorage) && Objects.equals(this.externalStorageSize, device.externalStorageSize) && Objects.equals(this.externalFreeStorage, device.externalFreeStorage) && Objects.equals(this.screenWidthPixels, device.screenWidthPixels) && Objects.equals(this.screenHeightPixels, device.screenHeightPixels) && Objects.equals(this.screenDensity, device.screenDensity) && Objects.equals(this.screenDpi, device.screenDpi) && Objects.equals(this.bootTime, device.bootTime) && Objects.equals(this.f26064id, device.f26064id) && Objects.equals(this.locale, device.locale) && Objects.equals(this.connectionType, device.connectionType) && Objects.equals(this.batteryTemperature, device.batteryTemperature) && Objects.equals(this.processorCount, device.processorCount) && Objects.equals(this.processorFrequency, device.processorFrequency) && Objects.equals(this.cpuDescription, device.cpuDescription) && Objects.equals(this.chipset, device.chipset)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public String[] getArchs() {
        return this.archs;
    }

    @Nullable
    public Float getBatteryLevel() {
        return this.batteryLevel;
    }

    @Nullable
    public Float getBatteryTemperature() {
        return this.batteryTemperature;
    }

    @Nullable
    public Date getBootTime() {
        Date date = this.bootTime;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    @Nullable
    public String getBrand() {
        return this.brand;
    }

    @Nullable
    public String getChipset() {
        return this.chipset;
    }

    @Nullable
    public String getConnectionType() {
        return this.connectionType;
    }

    @Nullable
    public String getCpuDescription() {
        return this.cpuDescription;
    }

    @Nullable
    public Long getExternalFreeStorage() {
        return this.externalFreeStorage;
    }

    @Nullable
    public Long getExternalStorageSize() {
        return this.externalStorageSize;
    }

    @Nullable
    public String getFamily() {
        return this.family;
    }

    @Nullable
    public Long getFreeMemory() {
        return this.freeMemory;
    }

    @Nullable
    public Long getFreeStorage() {
        return this.freeStorage;
    }

    @Nullable
    public String getId() {
        return this.f26064id;
    }

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    @Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }

    @Nullable
    public Long getMemorySize() {
        return this.memorySize;
    }

    @Nullable
    public String getModel() {
        return this.model;
    }

    @Nullable
    public String getModelId() {
        return this.modelId;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    @Nullable
    public DeviceOrientation getOrientation() {
        return this.orientation;
    }

    @Nullable
    public Integer getProcessorCount() {
        return this.processorCount;
    }

    @Nullable
    public Double getProcessorFrequency() {
        return this.processorFrequency;
    }

    @Nullable
    public Float getScreenDensity() {
        return this.screenDensity;
    }

    @Nullable
    public Integer getScreenDpi() {
        return this.screenDpi;
    }

    @Nullable
    public Integer getScreenHeightPixels() {
        return this.screenHeightPixels;
    }

    @Nullable
    public Integer getScreenWidthPixels() {
        return this.screenWidthPixels;
    }

    @Nullable
    public Long getStorageSize() {
        return this.storageSize;
    }

    @Nullable
    public TimeZone getTimezone() {
        return this.timezone;
    }

    @Override // io.sentry.JsonUnknown
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.unknown;
    }

    @Nullable
    public Long getUsableMemory() {
        return this.usableMemory;
    }

    public int hashCode() {
        return (Objects.hash(this.name, this.manufacturer, this.brand, this.family, this.model, this.modelId, this.batteryLevel, this.charging, this.online, this.orientation, this.simulator, this.memorySize, this.freeMemory, this.usableMemory, this.lowMemory, this.storageSize, this.freeStorage, this.externalStorageSize, this.externalFreeStorage, this.screenWidthPixels, this.screenHeightPixels, this.screenDensity, this.screenDpi, this.bootTime, this.timezone, this.f26064id, this.locale, this.connectionType, this.batteryTemperature, this.processorCount, this.processorFrequency, this.cpuDescription, this.chipset) * 31) + Arrays.hashCode(this.archs);
    }

    @Nullable
    public Boolean isCharging() {
        return this.charging;
    }

    @Nullable
    public Boolean isLowMemory() {
        return this.lowMemory;
    }

    @Nullable
    public Boolean isOnline() {
        return this.online;
    }

    @Nullable
    public Boolean isSimulator() {
        return this.simulator;
    }

    @Override // io.sentry.JsonSerializable
    public void serialize(@NotNull ObjectWriter objectWriter, @NotNull ILogger iLogger) {
        objectWriter.beginObject();
        if (this.name != null) {
            objectWriter.name("name").value(this.name);
        }
        if (this.manufacturer != null) {
            objectWriter.name("manufacturer").value(this.manufacturer);
        }
        if (this.brand != null) {
            objectWriter.name(JsonKeys.BRAND).value(this.brand);
        }
        if (this.family != null) {
            objectWriter.name(JsonKeys.FAMILY).value(this.family);
        }
        if (this.model != null) {
            objectWriter.name("model").value(this.model);
        }
        if (this.modelId != null) {
            objectWriter.name(JsonKeys.MODEL_ID).value(this.modelId);
        }
        if (this.archs != null) {
            objectWriter.name(JsonKeys.ARCHS).value(iLogger, this.archs);
        }
        if (this.batteryLevel != null) {
            objectWriter.name(JsonKeys.BATTERY_LEVEL).value(this.batteryLevel);
        }
        if (this.charging != null) {
            objectWriter.name(JsonKeys.CHARGING).value(this.charging);
        }
        if (this.online != null) {
            objectWriter.name(JsonKeys.ONLINE).value(this.online);
        }
        if (this.orientation != null) {
            objectWriter.name(JsonKeys.ORIENTATION).value(iLogger, this.orientation);
        }
        if (this.simulator != null) {
            objectWriter.name(JsonKeys.SIMULATOR).value(this.simulator);
        }
        if (this.memorySize != null) {
            objectWriter.name("memory_size").value(this.memorySize);
        }
        if (this.freeMemory != null) {
            objectWriter.name(JsonKeys.FREE_MEMORY).value(this.freeMemory);
        }
        if (this.usableMemory != null) {
            objectWriter.name(JsonKeys.USABLE_MEMORY).value(this.usableMemory);
        }
        if (this.lowMemory != null) {
            objectWriter.name(JsonKeys.LOW_MEMORY).value(this.lowMemory);
        }
        if (this.storageSize != null) {
            objectWriter.name(JsonKeys.STORAGE_SIZE).value(this.storageSize);
        }
        if (this.freeStorage != null) {
            objectWriter.name(JsonKeys.FREE_STORAGE).value(this.freeStorage);
        }
        if (this.externalStorageSize != null) {
            objectWriter.name(JsonKeys.EXTERNAL_STORAGE_SIZE).value(this.externalStorageSize);
        }
        if (this.externalFreeStorage != null) {
            objectWriter.name(JsonKeys.EXTERNAL_FREE_STORAGE).value(this.externalFreeStorage);
        }
        if (this.screenWidthPixels != null) {
            objectWriter.name(JsonKeys.SCREEN_WIDTH_PIXELS).value(this.screenWidthPixels);
        }
        if (this.screenHeightPixels != null) {
            objectWriter.name(JsonKeys.SCREEN_HEIGHT_PIXELS).value(this.screenHeightPixels);
        }
        if (this.screenDensity != null) {
            objectWriter.name(JsonKeys.SCREEN_DENSITY).value(this.screenDensity);
        }
        if (this.screenDpi != null) {
            objectWriter.name("screen_dpi").value(this.screenDpi);
        }
        if (this.bootTime != null) {
            objectWriter.name(JsonKeys.BOOT_TIME).value(iLogger, this.bootTime);
        }
        if (this.timezone != null) {
            objectWriter.name("timezone").value(iLogger, this.timezone);
        }
        if (this.f26064id != null) {
            objectWriter.name("id").value(this.f26064id);
        }
        if (this.connectionType != null) {
            objectWriter.name(JsonKeys.CONNECTION_TYPE).value(this.connectionType);
        }
        if (this.batteryTemperature != null) {
            objectWriter.name(JsonKeys.BATTERY_TEMPERATURE).value(this.batteryTemperature);
        }
        if (this.locale != null) {
            objectWriter.name("locale").value(this.locale);
        }
        if (this.processorCount != null) {
            objectWriter.name(JsonKeys.PROCESSOR_COUNT).value(this.processorCount);
        }
        if (this.processorFrequency != null) {
            objectWriter.name(JsonKeys.PROCESSOR_FREQUENCY).value(this.processorFrequency);
        }
        if (this.cpuDescription != null) {
            objectWriter.name(JsonKeys.CPU_DESCRIPTION).value(this.cpuDescription);
        }
        if (this.chipset != null) {
            objectWriter.name(JsonKeys.CHIPSET).value(this.chipset);
        }
        Map<String, Object> map = this.unknown;
        if (map != null) {
            for (String str : map.keySet()) {
                objectWriter.name(str).value(iLogger, this.unknown.get(str));
            }
        }
        objectWriter.endObject();
    }

    public void setArchs(@Nullable String[] strArr) {
        this.archs = strArr;
    }

    public void setBatteryLevel(@Nullable Float f10) {
        this.batteryLevel = f10;
    }

    public void setBatteryTemperature(@Nullable Float f10) {
        this.batteryTemperature = f10;
    }

    public void setBootTime(@Nullable Date date) {
        this.bootTime = date;
    }

    public void setBrand(@Nullable String str) {
        this.brand = str;
    }

    public void setCharging(@Nullable Boolean bool) {
        this.charging = bool;
    }

    public void setChipset(@Nullable String str) {
        this.chipset = str;
    }

    public void setConnectionType(@Nullable String str) {
        this.connectionType = str;
    }

    public void setCpuDescription(@Nullable String str) {
        this.cpuDescription = str;
    }

    public void setExternalFreeStorage(@Nullable Long l10) {
        this.externalFreeStorage = l10;
    }

    public void setExternalStorageSize(@Nullable Long l10) {
        this.externalStorageSize = l10;
    }

    public void setFamily(@Nullable String str) {
        this.family = str;
    }

    public void setFreeMemory(@Nullable Long l10) {
        this.freeMemory = l10;
    }

    public void setFreeStorage(@Nullable Long l10) {
        this.freeStorage = l10;
    }

    public void setId(@Nullable String str) {
        this.f26064id = str;
    }

    public void setLocale(@Nullable String str) {
        this.locale = str;
    }

    public void setLowMemory(@Nullable Boolean bool) {
        this.lowMemory = bool;
    }

    public void setManufacturer(@Nullable String str) {
        this.manufacturer = str;
    }

    public void setMemorySize(@Nullable Long l10) {
        this.memorySize = l10;
    }

    public void setModel(@Nullable String str) {
        this.model = str;
    }

    public void setModelId(@Nullable String str) {
        this.modelId = str;
    }

    public void setName(@Nullable String str) {
        this.name = str;
    }

    public void setOnline(@Nullable Boolean bool) {
        this.online = bool;
    }

    public void setOrientation(@Nullable DeviceOrientation deviceOrientation) {
        this.orientation = deviceOrientation;
    }

    public void setProcessorCount(@Nullable Integer num) {
        this.processorCount = num;
    }

    public void setProcessorFrequency(@Nullable Double d10) {
        this.processorFrequency = d10;
    }

    public void setScreenDensity(@Nullable Float f10) {
        this.screenDensity = f10;
    }

    public void setScreenDpi(@Nullable Integer num) {
        this.screenDpi = num;
    }

    public void setScreenHeightPixels(@Nullable Integer num) {
        this.screenHeightPixels = num;
    }

    public void setScreenWidthPixels(@Nullable Integer num) {
        this.screenWidthPixels = num;
    }

    public void setSimulator(@Nullable Boolean bool) {
        this.simulator = bool;
    }

    public void setStorageSize(@Nullable Long l10) {
        this.storageSize = l10;
    }

    public void setTimezone(@Nullable TimeZone timeZone) {
        this.timezone = timeZone;
    }

    @Override // io.sentry.JsonUnknown
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.unknown = map;
    }

    public void setUsableMemory(@Nullable Long l10) {
        this.usableMemory = l10;
    }

    public Device(@NotNull Device device) {
        this.name = device.name;
        this.manufacturer = device.manufacturer;
        this.brand = device.brand;
        this.family = device.family;
        this.model = device.model;
        this.modelId = device.modelId;
        this.charging = device.charging;
        this.online = device.online;
        this.orientation = device.orientation;
        this.simulator = device.simulator;
        this.memorySize = device.memorySize;
        this.freeMemory = device.freeMemory;
        this.usableMemory = device.usableMemory;
        this.lowMemory = device.lowMemory;
        this.storageSize = device.storageSize;
        this.freeStorage = device.freeStorage;
        this.externalStorageSize = device.externalStorageSize;
        this.externalFreeStorage = device.externalFreeStorage;
        this.screenWidthPixels = device.screenWidthPixels;
        this.screenHeightPixels = device.screenHeightPixels;
        this.screenDensity = device.screenDensity;
        this.screenDpi = device.screenDpi;
        this.bootTime = device.bootTime;
        this.f26064id = device.f26064id;
        this.connectionType = device.connectionType;
        this.batteryTemperature = device.batteryTemperature;
        this.batteryLevel = device.batteryLevel;
        String[] strArr = device.archs;
        this.archs = strArr != null ? (String[]) strArr.clone() : null;
        this.locale = device.locale;
        TimeZone timeZone = device.timezone;
        this.timezone = timeZone != null ? (TimeZone) timeZone.clone() : null;
        this.processorCount = device.processorCount;
        this.processorFrequency = device.processorFrequency;
        this.cpuDescription = device.cpuDescription;
        this.chipset = device.chipset;
        this.unknown = CollectionUtils.newConcurrentHashMap(device.unknown);
    }
}
