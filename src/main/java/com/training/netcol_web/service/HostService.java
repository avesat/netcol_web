package com.training.netcol_web.service;

import com.training.netcol_web.model.HostRequest;
import com.training.netcol_web.model.HostResponse;
import com.training.netcol_web.model.Host;
import com.training.proto.gen.HostProto;

public interface HostService {
    HostResponse startCollectHostData(HostRequest hostRequest);
    HostProto.Host getHostById(Long hostId);
    Host protoDeserialize(HostProto.Host hostProto);
}
