package fh;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonFieldParser;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.ParsingContextKt;
import com.yandex.div.serialization.TemplateDeserializer;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ki implements TemplateDeserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy f17581a;

    public ki(sy syVar) {
        this.f17581a = syVar;
    }

    @Override // com.yandex.div.serialization.TemplateDeserializer
    public final EntityTemplate deserialize(ParsingContext parsingContext, EntityTemplate entityTemplate, Object obj) {
        mi miVar = (mi) entityTemplate;
        return new mi(JsonFieldParser.readField(ParsingContextKt.restrictPropertyOverride(parsingContext), (JSONObject) obj, "neighbour_page_width", parsingContext.getAllowPropertyOverride(), miVar != null ? miVar.f17869a : null, this.f17581a.f18564w3));
    }
}
