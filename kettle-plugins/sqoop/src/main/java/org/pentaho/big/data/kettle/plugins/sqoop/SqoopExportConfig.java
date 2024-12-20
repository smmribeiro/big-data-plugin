/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2024 by Hitachi Vantara, LLC : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2029-07-20
 ******************************************************************************/


package org.pentaho.big.data.kettle.plugins.sqoop;

import org.pentaho.hadoop.shim.api.cluster.NamedCluster;

/**
 * Configuration for a Sqoop Export
 */
public class SqoopExportConfig extends SqoopConfig {
  public static final String EXPORT_DIR = "exportDir";
  public static final String UPDATE_KEY = "updateKey";
  public static final String UPDATE_MODE = "updateMode";
  public static final String DIRECT = "direct";
  public static final String STAGING_TABLE = "stagingTable";
  public static final String CLEAR_STAGING_TABLE = "clearStagingTable";
  public static final String BATCH = "batch";

  public static final String CALL = "call";
  public static final String COLUMNS = "columns";
  private final SqoopExportJobEntry jobEntry;

  @CommandLineArgument( name = "export-dir" )
  private String exportDir;
  @CommandLineArgument( name = "update-key" )
  private String updateKey;
  @CommandLineArgument( name = "update-mode" )
  private String updateMode;
  @CommandLineArgument( name = DIRECT, flag = true )
  private String direct;
  @CommandLineArgument( name = "staging-table" )
  private String stagingTable;
  @CommandLineArgument( name = "clear-staging-table", flag = true )
  private String clearStagingTable;
  @CommandLineArgument( name = BATCH, flag = true )
  private String batch;

  @CommandLineArgument( name = "call" )
  private String call;
  @CommandLineArgument( name = "columns" )
  private String columns;

  public SqoopExportConfig( SqoopExportJobEntry jobEntry ) {
    this.jobEntry = jobEntry;
  }

  @Override protected NamedCluster createClusterTemplate() {
    return jobEntry.getNamedClusterService().getClusterTemplate();
  }

  public String getExportDir() {
    return exportDir;
  }

  public void setExportDir( String exportDir ) {
    String old = this.exportDir;
    this.exportDir = exportDir;
    pcs.firePropertyChange( EXPORT_DIR, old, this.exportDir );
  }

  public String getUpdateKey() {
    return updateKey;
  }

  public void setUpdateKey( String updateKey ) {
    String old = this.updateKey;
    this.updateKey = updateKey;
    pcs.firePropertyChange( UPDATE_KEY, old, this.updateKey );
  }

  public String getUpdateMode() {
    return updateMode;
  }

  public void setUpdateMode( String updateMode ) {
    String old = this.updateMode;
    this.updateMode = updateMode;
    pcs.firePropertyChange( UPDATE_MODE, old, this.updateMode );
  }

  public String getDirect() {
    return direct;
  }

  public void setDirect( String direct ) {
    String old = this.direct;
    this.direct = direct;
    pcs.firePropertyChange( DIRECT, old, this.direct );
  }

  public String getStagingTable() {
    return stagingTable;
  }

  public void setStagingTable( String stagingTable ) {
    String old = this.stagingTable;
    this.stagingTable = stagingTable;
    pcs.firePropertyChange( STAGING_TABLE, old, this.stagingTable );
  }

  public String getClearStagingTable() {
    return clearStagingTable;
  }

  public void setClearStagingTable( String clearStagingTable ) {
    String old = this.clearStagingTable;
    this.clearStagingTable = clearStagingTable;
    pcs.firePropertyChange( CLEAR_STAGING_TABLE, old, this.clearStagingTable );
  }

  public String getBatch() {
    return batch;
  }

  public void setBatch( String batch ) {
    String old = this.batch;
    this.batch = batch;
    pcs.firePropertyChange( BATCH, old, this.batch );
  }

  public String getCall() {
    return call;
  }

  public void setCall( String call ) {
    String old = this.call;
    this.call = call;
    pcs.firePropertyChange( CALL, old, this.call );
  }

  public String getColumns() {
    return columns;
  }

  public void setColumns( String columns ) {
    String old = this.columns;
    this.columns = columns;
    pcs.firePropertyChange( COLUMNS, old, this.columns );
  }

}
