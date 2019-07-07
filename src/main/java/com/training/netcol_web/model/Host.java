package com.training.netcol_web.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@EqualsAndHashCode
@Data
@ToString
public class Host {
    private Long id;
    private Long requestId;
    private String ipAddress;
    private String user;
    private String password;
    private List<IpInterface> ipInterfaces;
    private List<IpRoute> ipRoutes;
}
